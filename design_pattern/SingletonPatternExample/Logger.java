package design_pattern.SingletonPatternExample;
public class Logger {

    private static Logger logger;

    //private constructor
    private Logger(){
        System.out.println("Logger initialized");
    }


    //static method to getLogInstance
    public static Logger  getInstance(){
        if (logger == null) {
            logger = new Logger(); // lazy initialization
        }
        return logger;
    }

    // Logging method for demonstration
    public void log(String message) {
        System.out.println("Log message: " + message);
    }

}