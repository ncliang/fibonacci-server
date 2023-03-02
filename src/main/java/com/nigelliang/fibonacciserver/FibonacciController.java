package com.nigelliang.fibonacciserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
    private final FibonacciCompute fibCompute;

    public FibonacciController(FibonacciCompute fibCompute) {
        this.fibCompute = fibCompute;
    }

    @GetMapping("/fibonacci/{number}")
    long compute(Long number) {
        return fibCompute.compute(number);
    }

}
