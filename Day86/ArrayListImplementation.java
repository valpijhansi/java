import java.util.*;
class ArrayListImplementation {
    public static void main(String args[]) {
        arrayList list = new arrayList(6);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.add(25);
        System.out.println(list);
        System.out.println(list.isEmpty());
        


    }
}
class arrayList {
    int count;
    int arr[];
    int size ;
    arrayList(int size) {
        this.size = size;
        arr = new int[size];
    }
    arrayList() {
        arr = new int[10];
    }
    void add(int value) {
        if(count==size) {
       int ar[] = new int[size+(size)/2];
       for(int i=0;i<arr.length;i++)
        ar[i] = arr[i];
        arr = ar;
        }
       
       arr[count++] = value;
    
   
    }
    @Override
    public String toString() {
        return "myArrayList{" +
                "count=" + count +
                ", arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';

            }
            int get(int index) {
                if(index>arr.length-1)
                    throw new IndexOutOfBoundsException();
                return arr[index];
            }
            boolean isEmpty() {
                if(count==0)
                return true;
                else
                return false;
            }
           
}

