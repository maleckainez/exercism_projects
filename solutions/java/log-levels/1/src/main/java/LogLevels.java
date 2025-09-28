public class LogLevels {
    
    public static String message(String logLine) {
        int indexofTwoDots = logLine.indexOf(":");
        return logLine.substring(indexofTwoDots+1, logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
        int indexofTwoDots = logLine.indexOf(":");
        return logLine.substring(1, indexofTwoDots-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+ logLevel(logLine)+ ")";
    }
}
