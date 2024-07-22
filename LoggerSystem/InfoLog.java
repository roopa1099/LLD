package Logger;

public class InfoLog extends Log {

    public InfoLog(Log nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    void log(LogType logType, String message) {
        if (logType == LogType.INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logType, message);
        }
    }

}
