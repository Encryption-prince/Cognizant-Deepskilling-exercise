public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Instance Created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMsg(String message) {
        System.out.println("Log : " + message);
    }
}
