
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class dataOutputStream {

    public static void main(String[] args) {
        
        try {

            FileOutputStream fos = new FileOutputStream("weight.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            double weights[] = {4.76,8.97,9.67,3.23};

            dos.writeInt(weights.length); 

            for(int i=0;i<weights.length;i++) {
                dos.writeDouble(weights[i]); 
            }
            dos.close();
            fos.close();
              
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}