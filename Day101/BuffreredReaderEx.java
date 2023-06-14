
    import java.io.BufferedWriter;
import java.io.FileWriter;

    public class BuffreredReaderEx {


        public static void main(String[] args) {


            try {
                FileWriter fw = new FileWriter("mock.txt");

                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Jaanu");//when ever we write this it will erase the previous content and replace with given String
                bw.close();

            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

