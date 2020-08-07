package com.logsourcing;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;

public class InfluxClient {
    private final InfluxDBClient influxDBClient;

    public InfluxClient()
    {
        this.influxDBClient = InfluxDBClientFactory.create("http://localhost:8086");
    }

    public void writeLine(LogLine line)
    {
        Point p = Point.measurement("ERRORS");

        p.addTag("SEVERITY", line.severity.name());
        p.time(line.time, WritePrecision.MS);
        p.addTag("PATTERN", line.messagePattern);
        p.addTag("MACHINE", line.machineName);
        p.addTag("APP", line.appName);
        p.addTag("VERSION", line.versionName);

        influxDBClient.getWriteApi().writePoint(p);
    }
}
