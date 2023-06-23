
    import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class bufferedOutputStreamreader {



        public static void main(String[] args) {

            try{

                FileOutputStream fos = new FileOutputStream("Mock.txt");

                BufferedOutputStream bos =  new BufferedOutputStream(fos);
                String str = "jannu papa";
                byte a[] = str.getBytes();

                bos.write(a);
                fos.flush();
                bos.flush();
                fos.close();
                bos.close();
                System.out.println("Hey Hello.....");
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

