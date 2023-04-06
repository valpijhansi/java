//print binary search using recursion
class BinarySearch {
    public static void main(String args[]) {
        int A[] = { 1, 4, 7, 8 };
        int x = 4;
        int res = binarySearch(A, x, 0, A.length - 1);
        System.out.println(res);
    }

    static int binarySearch(int A[],int x,int low,int high)
    {
        if(!(low<=high))
        return 1;
        int mid=(low+high/2);
        if(A[mid]==x)
        return mid;
        else
        {
        if(A[mid]<x)
        {
        low=mid+1;
        return binarySearch(A,x,low,high);
        }
        
    else
    {
    high=mid+1;
    return binarySearch(A,x,low,high);
    }
        }
    }
}