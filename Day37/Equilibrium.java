//print the equilibrium index of an Array
class equilibrium {
    public static void main(String args[])
    {
        int A[]={1,2,3,5,1,2,3};
        for(int i=0;i<A.length;i++)
        {
            int lsum=0;
            int rsum=0;
            for(int j=0;j<i;j++)
            lsum+=A[j];
            for(int j=i+1;j<A.length;j++)
            rsum+=A[j];
            if(lsum==rsum)
            {
                System.out.println(i);
                return;
            }
            
            
        }
        System.out.println(-1);
    }
}