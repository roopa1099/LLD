package Logger;

public class Main {
    public static void main(String[] args) {
        Log log = new DebugLog(new InfoLog(new ErrorLog(null)));
        log.log(LogType.INFO, "Hi");
        log.log(LogType.DEBUG, "Hi");
        log.log(LogType.ERROR, "Hi");
    }
}
