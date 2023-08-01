package LoggerConcept;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

 class consoleHandler {
    public static void main(String[] args) {


         final Logger LOGGER = Logger.getLogger(Hostel.class.getName());
        ConsoleHandler console = new ConsoleHandler();
        console.setLevel(Level.FINEST);
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(console);
        LOGGER.setLevel(Level.FINEST);
        LOGGER.severe("severe");
        LOGGER.warning("warning");
        LOGGER.info("info");
        LOGGER.config("config");
        LOGGER.fine("fine");
        LOGGER.finer("finer");
        LOGGER.finest("finest");
    }


}
