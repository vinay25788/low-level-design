import java.time.LocalDateTime;

public class LogMessage {

    private final LocalDateTime timestamp;

    LogLevel logLevel;
    String loggerName;
    String msg;

   public LogMessage(LogLevel logLevel, String loggerName, String msg)
    {
        this.timestamp = LocalDateTime.now();
        this.logLevel = logLevel;
        this.loggerName = loggerName;
        this.msg = msg;
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getLoggerName() {
        return loggerName;
    }

    public String getMsg() {
        return msg;
    }
}
