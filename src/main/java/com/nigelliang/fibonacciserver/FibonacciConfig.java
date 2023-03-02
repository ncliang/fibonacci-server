package com.nigelliang.fibonacciserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FibonacciConfig {
    @Bean
    FibonacciCompute fibCompute() {
        return new FibonacciCompute();
    }
}
