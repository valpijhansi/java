import java.util.*;

class stringBuffer {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("Lucky");
        sb.append("1217");
        sb.append("Jaanu");
        System.out.println(sb);

        String res = sb.toString();
        System.out.println(res);

        sb.insert(3, "loki");// it wii insert the value at index 3
        System.out.println(sb);

        sb.replace(1, 3, "jan");// it will replace the value with given string.
        System.out.println(sb);

        sb.delete(0, 4);// it will delete the 0th index but not the 4th index
        System.out.println(sb);

        sb.reverse(); // the name itself syas that it can reverse the given String
        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println(sb.indexOf("1217"));

    }
}