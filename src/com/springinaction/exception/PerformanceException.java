package com.springinaction.exception;

/**
 * Created by yiben on 2015/10/21.
 */
public class PerformanceException extends Exception {

    public PerformanceException() {
        super();
    }

    public PerformanceException(String message) {
        super(message);
    }

    public PerformanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PerformanceException(Throwable cause) {
        super(cause);
    }

    protected PerformanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
