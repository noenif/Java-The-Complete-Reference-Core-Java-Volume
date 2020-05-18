package Chapter_7_Exceptions_Assertions_and_Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger1 {
    private static final Logger myLogger = Logger.getLogger("Chapter_7_Exceptions_Assertions_and_Logging");

    public static void main(String[] args) {
        Logger.getGlobal().setLevel(Level.ALL);
        myLogger.log(Level.FINE, "log 方法");


    }


}
