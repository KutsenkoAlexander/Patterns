package ua.kay.patterns.creational.singleton;

public class ProgramLogger {
    private static volatile ProgramLogger logger;
    private static String logFile = "This is log file. \n";

    private ProgramLogger() {
    }

    static ProgramLogger getInstance() {
        if (logger == null) {
            synchronized (ProgramLogger.class) {
                if (logger == null) {
                    logger = new ProgramLogger();
                }
            }
        }
        return logger;
    }

    void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    void showLogFile() {
        System.out.println(logFile);
    }
}
