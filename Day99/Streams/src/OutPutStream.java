
    import java.io.FileOutputStream;

    public class OutPutStream {

        public static void main(String[] args) {

            try {
                FileOutputStream output = new FileOutputStream("mock.txt");
                String str = "hello everyone!";
                byte a[] = str.getBytes();
                output.write(a,2,6);
                output.write(a);
                output.close();

            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

