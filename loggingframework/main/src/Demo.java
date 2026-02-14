

public class Demo {

    public static void main(String[] args) throws InterruptedException {
          Logger logger = Logger.getLogger("order service");

          logger.info("application started");
          logger.debug("debug log");
          logger.error("something failed");

        Thread.sleep(500);
    }
}
