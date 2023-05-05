public class classNotfound {
    public static void main(String[] args) {
        try {
            Class.forName("classnotFound");
            ClassLoader.getSystemClassLoader().loadClass("classnotFound");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
