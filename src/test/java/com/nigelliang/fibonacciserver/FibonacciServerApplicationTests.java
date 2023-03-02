package com.nigelliang.fibonacciserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FibonacciServerApplicationTests {
    @Autowired
    private FibonacciCompute fibonacciCompute;

    @Test
    void contextLoads() {
        assertNotNull(fibonacciCompute);
        assertEquals(0, fibonacciCompute.compute(0));
        assertEquals(1, fibonacciCompute.compute(1));
        assertEquals(1, fibonacciCompute.compute(2));
    }

}
