public class RepeatingElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,1,2,3,6,7};
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=i+1;j<arr.length;j++) {
                if(i!=j)
                if(arr[i]==arr[j]) {
                    count++;
                    break;
                }
                if(count==0) {
                    System.out.println(count);
                    return;
                }

            }
        }
    }
}
//class lonelyElement {
//    public static void main(String args[]) {
//        int a[] = { 8,6,1, 2, 2, 3, 7, 3, 4, 1, 7,4,5} ;
//        for (int i = 0; i < a.length; i++) {
//            int j;
//            for (j = 0; j < a.length; j++) {
//                if (i != j) {
//                    if (a[i] == a[j])
//                        break;
//                }
//            }
//            if (j == a.length) {
//                System.out.print(a[i]);
//                return;
//            }
//        }
//    }
//}
