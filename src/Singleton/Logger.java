package Singleton;

public class Logger {

    public static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (Logger.instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println(logger1);
        System.out.println(logger);


    }
}
