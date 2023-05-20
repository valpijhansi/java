import java.util.regex.Pattern;

class MetaCharacters {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("\\d", "7")); //  it contains Any digits, short of [0-9] return boolean values
        System.out.println(Pattern.matches("[\\d]{3}", "124"));
        System.out.println(Pattern.matches("\\d", "j"));
        System.out.println(Pattern.matches("\\D", "l")); // it contains non-digit, short for [^0-9] and returns boolean
                                                         // value
        System.out.println(Pattern.matches("\\D", "1"));// it returns false because \\D contains only non digits
        System.out.println(Pattern.matches("\\s", "\t")); // it contains whitespace character, short for [\t\n\x0B\f\r]
                                                          // and returns boolean value
        System.out.println(Pattern.matches("\\S", "h")); // Any non-whitespace character, short for [^\s]
        System.out.println(Pattern.matches("\\w*", "jaanu_12")); // Any word character, short for [a-zA-Z_0-9]
        System.out.println(Pattern.matches("\\W", "*")); // Any non-word character, short for [^\w]

    }
}
