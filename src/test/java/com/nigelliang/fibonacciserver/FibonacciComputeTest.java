package com.nigelliang.fibonacciserver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciComputeTest {
    private final FibonacciCompute fibCompute = new FibonacciCompute();

    @Test
    public void testFib() {
        assertEquals(0, fibCompute.compute(0));
        assertEquals(1, fibCompute.compute(1));
        assertEquals(1, fibCompute.compute(2));
    }

}
