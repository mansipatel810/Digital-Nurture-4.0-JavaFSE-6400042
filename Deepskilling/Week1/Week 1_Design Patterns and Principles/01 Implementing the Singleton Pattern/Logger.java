public class Logger {
    private static Logger singleInstance;

    private Logger() {
        System.out.println("Logger initialized.");
    }

    public static Logger getLogger() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    public void writeLog(String msg) {
        System.out.println("Log: " + msg);
    }
}
