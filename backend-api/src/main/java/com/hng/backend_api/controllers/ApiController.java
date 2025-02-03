package com.hng.backend_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")


public class ApiController {
    @GetMapping
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();
        response.put("email", "afolabitemiloluwa4@gmail.com");

        String currentDatetime = Instant.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);

        response.put("current_datetime", currentDatetime);

        response.put("github url", "https://github.com/SmashRex/your-repo");


        return response;
    }
}
