#log-sourcing

Log sourcing is my method of trying to map all the ERROR and WARN logs you have in your system in a cost effective way.

The basic idea is that storing logs is expensive and requires a log storage or money.

However, what we can try to do instead is to deduplicate logs that are similar (by using REGEX) and then you can get by using a timeseries db like influx:

This way you can just extrac the pattern of the log message, and then store that with its point time and other tags - like server it originated in, giving your much powerful stats and with a fraction of the storage space

This also generates a list of ERRORS and WARNINGS you have in your system, so it acts as a technical debt list or a bank of tasks to put and resolve in your backlog.

TODO:
Dockerfile
This project is not working yet