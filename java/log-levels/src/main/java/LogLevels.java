public class LogLevels {

    public static String message(String logLine) {
        return logLine.substring(colonIndex(logLine) + 1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(0, colonIndex(logLine))
            .replace("[", "")
            .replace("]", "")
            .toLowerCase()
            .trim();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }

    public static int colonIndex(String string) {
        return string.indexOf(":");
    }
}
