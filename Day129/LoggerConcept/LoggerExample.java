package LoggerConcept;

import java.io.IOException;
import java.util.logging.*;

class LoggerExample {
    public static void main(String[] args) throws IOException {


        final Logger LOGGER = Logger.getLogger(Hostel.class.getName());
        FileHandler file = new FileHandler("Data.log",true);
        file.setFormatter(new SimpleFormatter());
        file.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(file);
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
