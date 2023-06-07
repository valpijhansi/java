import java.lang.reflect.Field;

class setField {

    public static void main(String args[]) throws IllegalArgumentException, IllegalAccessException {
        Crane c = new Crane();
        Field[] fields = c.getClass().getDeclaredFields();
       // System.out.println(c.getZ());
        for(Field x : fields) {
            if(x.getName().equals("z")) {
                x.setAccessible(true);
                x.set(c,14);

            }
            System.out.println(c.getZ());

        }
    }
}