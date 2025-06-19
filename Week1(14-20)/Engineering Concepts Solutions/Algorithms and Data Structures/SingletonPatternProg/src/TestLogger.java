public class TestLogger {
    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.logMsg("This is the first log message.");
        l2.logMsg("This is the second log message.");

        if(l1==l2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Loggers are different instances.");
        }
    }
}
