package com.hng.backend_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ApiController {
    @GetMapping
    public Map<String, String> getInfo() {
        Map<String, String> response = new LinkedHashMap<>(); // Preserves key order

        response.put("email", "afolabitemiloluwa4@gmail.com"); // First
        response.put("current_datetime", Instant.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT)); // Second
        response.put("github_url", "https://github.com/SmashRex/simple_backend_api.git"); // Third

        return response;
    }
}
