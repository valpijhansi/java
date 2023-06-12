public class FileInputStream {
        public static void main(String[] args) {
            try {
                java.io.FileInputStream input = new java.io.FileInputStream("rock1.txt");
                byte array[] = new byte[input.available()];
                input.read(array); //this can read the file and store in an array
                                  //once read the file it will earse from the buffer.
                String str = new String(array);
                System.out.println(str);
                input.close();

            }
            catch(Exception e) {
                e.getStackTrace();

            }
        }
    }

