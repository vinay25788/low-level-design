import java.util.concurrent.ConcurrentHashMap;

public class Logger {

    private static final ConcurrentHashMap<String, Logger> CACHE =
            new ConcurrentHashMap<>();

    private  final String name;

    private LogLevel logLevel = LogLevel.INFO;


    public Logger(String name) {
        this.name = name;
    }

    public static Logger getLogger(String name)
    {
        return CACHE.computeIfAbsent(name , Logger::new);
    }



    public void setLogLevel(LogLevel level)
    {
        this.logLevel = level;
    }

    private void log(LogLevel logLevel, String msg)
    {
        if(logLevel.isEnabled(this.logLevel))
        {
            LogMessage mg = new LogMessage(logLevel,name, msg);
            LogProcessor.getInstance().processMessage(mg);
        }
    }


    public void debug(String msg)
    {
        log(LogLevel.DEBUG, msg);
    }

    public void info(String msg)
    {
        log(LogLevel.INFO, msg);
    }

    public void error(String msg)
    {
        log(LogLevel.ERROR, msg);
    }

}
