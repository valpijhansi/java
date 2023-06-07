class Rock {
    @SuppressWarnings(value = { "deprecated" })
    Nick n = new Nick();
}
class Nick {
    @Deprecated
    static void run(String str) {
        System.out.println(str);
        System.out.println();
    }
}