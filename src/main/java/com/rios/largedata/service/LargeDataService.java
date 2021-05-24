package com.rios.largedata.service;

import com.rios.largedata.domain.TableA;
import com.rios.largedata.repository.TableARepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class LargeDataService {

    private final TableARepository tableARepository;
    private final EntityManager entityManager;

    @Transactional(readOnly = true)
    public void getLargeDataStream() {
        log.info("getLargeDataStream");

        List<TableA> rows = new ArrayList<>();
        StopWatch sw = new StopWatch();
        sw.start();
        try(Stream<TableA> streamTableA = tableARepository.findAllRecords()) {
            streamTableA.forEach(tableA -> {
                rows.add(tableA);
                entityManager.detach(tableA);

                if (rows.size() == 10000) {
                    log.info("rows {}, last add id {}", rows.size(), tableA.getId());
                    rows.clear();
                }
            });
        }
        sw.stop();
        log.info("total time (ms): {}", sw.getTotalTimeMillis());
    }

}