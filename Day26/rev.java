//reverse the string

class rev {
    public static void main(String args[]) {
        String str = "Being Alone is the best thing";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 += str.charAt(str.length() - i - 1);
        }

        System.out.print(str1);

        
        }

    }
