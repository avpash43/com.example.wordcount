package com.example.wordcount.controller;

import com.example.wordcount.service.WordCountService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/word/count")
public class WordCountController {
    private final WordCountService wordCountService;

    @PostMapping
    @ApiOperation(value = "Get word count from string")
    public ResponseEntity<Map<String, Long>> getTables(@RequestBody String text) {
        return ResponseEntity.ok().body(wordCountService.getWordCountMap(text));
    }
}
