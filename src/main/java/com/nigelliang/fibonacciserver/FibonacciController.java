package com.nigelliang.fibonacciserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;

@RestController
public class FibonacciController {
    private final FibonacciCompute fibCompute;

    public FibonacciController(FibonacciCompute fibCompute) {
        this.fibCompute = fibCompute;
    }

    @GetMapping("/fibonacci/{number}")
    ResponseEntity<FibonacciResponse> compute(@PathVariable Long number) {
        Instant start = Instant.now();
        long result = fibCompute.compute(number);
        Instant end = Instant.now();

        return ResponseEntity.ok(
                new FibonacciResponse(
                        result,
                        Duration.between(start, end).toMillis()
                )
        );
    }

}
