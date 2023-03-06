package com.nigelliang.fibonacciserver;

public class FibonacciCompute {
    long compute(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        }
        return compute(i - 1) + compute(i - 2);
    }
}
