package com.rios.largedata.web;

import com.rios.largedata.service.LargeDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class LargeDataController {

    private final LargeDataService largeDataService;

    @GetMapping
    public ResponseEntity<Void> getLargeData() {
        log.info("request received...");
        largeDataService.getLargeDataStream();
        return ResponseEntity.ok().build();
    }
}
