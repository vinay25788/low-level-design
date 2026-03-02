import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LogProcessor {

    private static final LogProcessor instance= new LogProcessor();

    private final BlockingQueue<LogMessage> blockingQueue = new LinkedBlockingQueue<>(100);

    private final LogAppender appender = new ConsoleAppender();


    private LogProcessor()
    {
        startWorker();
    }


    public static LogProcessor getInstance()
    {
        return instance;
    }

    public void processMessage(LogMessage msg)
    {
        try {
            blockingQueue.put(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void startWorker()
    {
        Thread workerThread = new Thread(() ->
        {
            while(true){
                try {
                    LogMessage msg = blockingQueue.take();
                    appender.append(msg);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
                );
        workerThread.setDaemon(true);
        workerThread.setName("logProcessor - worker");
        workerThread.start();
    }
}
