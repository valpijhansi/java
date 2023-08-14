public class MultiThreadingExample extends Thread {
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"Jaanu");
            i++;
        }
    }
}
 class test{
     public static void main(String[] args) {
         MultiThreadingExample me = new MultiThreadingExample();
         me.start();
         int i=1;
         while (true){
             System.out.println(i+"lucky");
             i++;
         }
     }
}
