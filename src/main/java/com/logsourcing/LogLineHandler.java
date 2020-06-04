package com.logsourcing;

// Takes in a log line, and decomposes it to time, severity, and log-pattern

public class LogLineHandler {
    private String[] COMMON_REGEX_TO_STRIP = {"d+", ".*\\\\.*", ".*/.*"};

    // expected to be given in the form of groups
    private final String lineGroupRegex;

    LogLineHandler(String lineGroupRegex)
    {
        this.lineGroupRegex = lineGroupRegex;
    }
}
