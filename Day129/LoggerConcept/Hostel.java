package LoggerConcept;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Hostel {
    static public void main(String args[]) throws IOException {
        final Logger LOGGER = Logger.getLogger("Rock");
        FileHandler file = new FileHandler("data.log");
        FileHandler file1 = new FileHandler("Data.log",true);//whenever we use append the existing data will not be removed it displays presentdata and alreadyexisting data
        file.setLevel(Level.CONFIG);
        file.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(file);
        LOGGER.setLevel(Level.CONFIG);
        LOGGER.config("file configuration done successfully");
        LOGGER.config("Done successfully");
    }
}
