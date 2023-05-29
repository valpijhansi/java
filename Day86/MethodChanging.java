class MethodChanging {
    public static void main(String args[]) {
        String name  = "jaanupapa";
        boolean ans = name.toUpperCase().equals("JAANUPAPA");
        String str = "     jaanupapa".concat("loki").trim(); 
        str  = str.replace('p','k').substring(0);
        System.out.println(str);
        System.out.println(ans);
    }
}