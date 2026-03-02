public class ConsoleAppender implements LogAppender {



    @Override
    public void append(LogMessage logMessage) {
        System.out.printf("%s [%s] %s - %s%n",
                logMessage.getTimestamp(),
                logMessage.getLogLevel(),
                logMessage.getLoggerName(),
                logMessage.getMsg());
    }
}
