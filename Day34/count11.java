//count occurance of String in number ex:"11xab11"-->2
class count11
{
    public static void main(String args[])
    {
        String str="11x11ab11";
        System.out.println(Count11(str));
    }
    static int Count11(String str)
    {
        if(str.length()<2)
        return 0;
        if(str.substring(0,2).equals("11"))
        return 1+Count11(str.substring(2));
        else
        return Count11(str.substring(1));
    }
}