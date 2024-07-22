package Logger;

enum LogType {
    INFO,
    DEBUG,
    ERROR
}

public abstract class Log {

    Log nextLogHandler;

    public Log(Log nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    void log(LogType logType, String message) {
        nextLogHandler.log(logType, message);
    }
}
