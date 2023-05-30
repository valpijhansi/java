//deeptostring is used to print two dimensional values without loop.
import java.util.Arrays;

public class DeepToString {

    public static void main(String[] args) {

        int  arr[] = {5,9,7,3,8};

        int a[][] = {

                {2,9,3,7},
                {8,4,4,2},
                {3,2,1,9}

        };

        System.out.println(Arrays.toString(arr)); 

        for(var x:a) {
            System.out.println(Arrays.toString(x)); 
        }


        System.out.println(Arrays.deepToString(a)); 

    }
}