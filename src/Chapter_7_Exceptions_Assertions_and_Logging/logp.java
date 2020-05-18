//package Chapter_7_Exceptions_Assertions_and_Logging;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class severe {
//    private Logger logger;
//
//    public void severe(final String message, final Throwable thrown) {
//        if (!this.logger.isLoggable(Level.SEVERE)) {
//            return;
//        }
//        String componentClassName = "gh";
//        logger.logp(Level.SEVERE, componentClassName, getCallerMethodName(), message, thrown);
//    }

//    private String getCallerMethodName() {
//
//    }
//}
