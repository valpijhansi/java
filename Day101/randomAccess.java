
    import java.io.RandomAccessFile;

    public class randomAccess {

        public static void main(String[] args) {

            try {

                RandomAccessFile raf = new  RandomAccessFile("mock.txt","rw");
                System.out.println((char)raf.read());
                System.out.println((char)raf.read());

                System.out.println((char)raf.read());
                System.out.println(raf.getFilePointer());


                raf.write('x');
                raf.skipBytes(3);
                System.out.println((char)raf.read());
                System.out.println((char)raf.read());
                raf.seek(4);
                System.out.println((char)raf.read());
                System.out.println((char)raf.read());

                System.out.println(raf.getFilePointer());
                System.out.println(raf.getFilePointer()-5);

                raf.writeBytes("JaanuPapa");



                raf.close();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
}
