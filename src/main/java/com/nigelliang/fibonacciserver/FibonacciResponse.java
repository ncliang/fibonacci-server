package com.nigelliang.fibonacciserver;

public class FibonacciResponse {
    private final long response;
    private final long durationMs;

    public FibonacciResponse(long response, long durationMs) {
        this.response = response;
        this.durationMs = durationMs;
    }

    public long getResponse() {
        return response;
    }

    public long getDurationMs() {
        return durationMs;
    }
}
