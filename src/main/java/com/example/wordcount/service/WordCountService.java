package com.example.wordcount.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WordCountService {
    public Map<String, Long> getWordCountMap(String text) {
        var result = new HashMap<String, Long>();
        List<String> words = Arrays.asList(text.split(" "));

        words.forEach(word -> {
            result.computeIfPresent(word, (key, value) -> value + 1L);
            result.putIfAbsent(word, 1L);
        });

        return result;
    }
}
