package com.logsourcing;

public class LogLine {
    Severity severity;
    long time;
    String messagePattern;
    String machineName;
    String appName;
    String versionName;

    public LogLine(Severity severity, long time, String messagePattern, String machineName, String appName, String versionName)
    {
        this.severity = severity;
        this.time = time;
        this.messagePattern = messagePattern;
        this.machineName = machineName;
        this.appName = appName;
        this.versionName = versionName;
    }

    public enum Severity {
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL
    }
}
