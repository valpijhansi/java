package LoggerConcept;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class loggerConceptEx {
    static final Logger LOGGER = Logger.getLogger("Rock");

    public static void main(String[] args) throws IOException {
        FileHandler file = new FileHandler("my-data.log");
        file.setLevel(Level.CONFIG);
        file.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(file);
        LOGGER.setLevel(Level.CONFIG);
        LOGGER.config("Configuration done successfully");
        if(true){
            LOGGER.setLevel(Level.INFO);
            LOGGER.info("Give information");
        }
    }
}
