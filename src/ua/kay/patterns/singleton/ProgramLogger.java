package ua.kay.patterns.singleton;

public class ProgramLogger {
    private static volatile ProgramLogger logger;
    private static String logFile = "This is log file. \n";

    private ProgramLogger() {
    }

    public static ProgramLogger getInstance() {
        if (logger == null) {
            synchronized (ProgramLogger.class) {
                if (logger == null) {
                    logger = new ProgramLogger();
                }
            }
        }
        return logger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
