package Logger;

public class ErrorLog extends Log {
    public ErrorLog(Log nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    void log(LogType logType, String message) {
        if (logType == LogType.ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(logType, message);
        }
    }
}
