package LoggerConcept;

import java.io.IOException;
import java.util.logging.*;

public class loggerConceptEx {

    public static void main(String[] args) throws IOException {
        final Logger LOGGER = Logger.getLogger("Rock");

        FileHandler file = new FileHandler("my-data.log");
        file.setLevel(Level.CONFIG);
        file.setFormatter(new XMLFormatter());
        LOGGER.addHandler(file);
        LOGGER.setLevel(Level.CONFIG);
        LOGGER.config("Configuration done successfully");
        if(true){
            LOGGER.setLevel(Level.INFO);
            LOGGER.info("Give information");
        }
    }
}
