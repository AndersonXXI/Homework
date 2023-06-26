package HW9;

public class MyClass {
    private MyClass() {
    }

    public static <T> T factoryMethod() {
        try {
            Class<T> c = (Class<T>) Class.forName("повне ім'я класу T");
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
