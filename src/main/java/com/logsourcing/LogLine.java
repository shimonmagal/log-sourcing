package com.logsourcing;

public class LogLine {
    String message;
    Severity severity;
    long time;

    private enum Severity {
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL
    }
}
