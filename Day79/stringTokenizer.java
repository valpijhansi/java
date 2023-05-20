import java.util.*;

class stringTokenizer {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Being-alone-is-the-best-thing!");
        ArrayList<String> tokens = new ArrayList();
        while (st.hasMoreTokens())
            tokens.add(st.nextToken("-"));
        Iterator<String> iterator = tokens.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}