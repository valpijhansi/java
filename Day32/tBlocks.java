//if triangle made block in 1st,2nd&3rd with 1,2,3 blocks respectively.
//Find the total no.of blocks using recursion
class tBlock {
    public static void main(String args[]) {
        int rows = 4;
        int result = blocks(rows);
        System.out.print(result);
    }

    static int blocks(int rows) {
        if (rows == 0)
            return 0;
        if (rows == 1)
            return 1;
        int res = rows + blocks(rows - 1);
        return res;
    }
}