# Simple Boot application with Log4j2 integration

Log4j 2 provides a significant improvement in performance compared to its predecessor. It contains asynchronous loggers and supports multiple APIs including SLF4J, commons logging, and java.util.loggging.

If you have worked in backend, then you would know the importance of logging especially for the applications deployed in production. Inserting log requests into the application code rquires a fair amount of planning and effort.

Observation shows that approximately 4 percent of code is dedicated to logging. Consequently, even moderately sized applications will have thousands big logging statements embedded within their code. Given their number, it becomes imperative to manage these log statements without the need to modify them manually.

This application is just a simple illustration of using Apache's Log4j2 dependency where I have used both ConsoleAppender and RollingFileAppender.
