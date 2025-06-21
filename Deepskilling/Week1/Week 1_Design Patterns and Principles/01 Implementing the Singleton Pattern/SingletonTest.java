public class SingletonTest {
    public static void main(String[] args) {
        Logger logA = Logger.getLogger();
        logA.writeLog("Starting application...");

        Logger logB = Logger.getLogger();
        logB.writeLog("Application running...");

        if (logA == logB) {
            System.out.println("Confirmed: Only one Logger instance exists.");
        } else {
            System.out.println("Error: Multiple Logger instances found.");
        }
    }
}
