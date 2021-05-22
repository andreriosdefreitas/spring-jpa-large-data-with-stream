package com.rios.largedata.repository;

import com.rios.largedata.domain.TableA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.stream.Stream;

@Repository
public interface TableARepository extends JpaRepository<TableA,Integer> {

    @QueryHints(value = {
            @QueryHint(name = org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE, value = "" + 1000),
            @QueryHint(name = org.hibernate.jpa.QueryHints.HINT_CACHEABLE, value = "false")
    })
    @Query("select a from TableA a")
    Stream<TableA> findAllRecords();
}
