package com.example.springactuatorfilter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AppEndpoint {

    @GetMapping
    public Map<String, String> testEndpoint() {
        return Map.of(
            "source", "app",
            "status", String.valueOf(TestFilter.CONTEXT.get())
        );
    }

}
