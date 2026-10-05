package org.example.health;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "OK");
    }

}
