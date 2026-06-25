public class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("Logger object created");
    }

    public static Logger getLogger() {

        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void showMessage(String msg) {
        System.out.println("LOG : " + msg);
    }
}