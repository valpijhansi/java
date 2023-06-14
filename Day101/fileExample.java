
    import java.io.File;
    public class fileExample {



        public static void main(String[] args) {
            try {

                File f = new File("mock.txt","rw");
                f.createNewFile();

            }
            catch(Exception e) {
                System.out.println(e.getMessage());

            }


        }

    }

