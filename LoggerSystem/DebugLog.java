package Logger;

public class DebugLog extends Log {

    public DebugLog(Log nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    void log(LogType logType, String message) {
        if (logType == LogType.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(logType, message);
        }
    }
}
