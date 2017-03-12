import java.util.logging.*;

/**
 * LogExample
 */
class LogExample {  
    //
    private final static Logger logr = Logger.getLogger( Logger.GLOBAL_LOGGER_NAME );     
    //
    private static void setupLogger() {
        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);
        
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        logr.addHandler(ch);

        try {
            FileHandler fh = new FileHandler("myLogger.log", true);
            fh.setLevel(Level.FINE);
            logr.addHandler(fh);
        } catch (java.io.IOException e) {            
            // don't stop my program but log out to console.
            logr.log(Level.SEVERE, "File logger not working.", e);
        }
         /* 
         Different Levels in order.
          OFF
          SEVERE
          WARNING
          INFO
          CONFIG
          FINE
          FINER
          FINEST
          ALL
        */
    }
    //
    public static void main(String[] args) throws java.io.IOException {
        // setup the logger
        setupLogger();               

        // log some stuff
        logr.info("My first log");
        logr.fine("My second log");
        
        // test logger in another class.
        Test.test();


        // purposly throw an error and log it.
        try {
            throw new java.io.IOException("Fake error message");
        }
        catch (java.io.IOException e) {
            logr.log(Level.SEVERE, "A fake error occurred mate!", e);
            // let the error happen after we've logged it
            throw e;
        }          
       
    }
    //
    public static void methodHere() {
         // log from other methods
         logr.config("Just doing some stuff");
    }
    //
}
/**
 * TEST
 */
class Test {
    // use the same logger that we setup in LogExample class
    private final static Logger logr = Logger.getLogger( Logger.GLOBAL_LOGGER_NAME );     
    //
    static void test(){
        logr.info("I'm from another class");
    }
    //
}
