package HW8;

public class Main2 {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", 5,true);
        Animal lion2 = new Animal("Lion", 5,true);
        Animal zebra = new Animal("Zebra", 3,true);
        System.out.println(lion);
        System.out.println(lion.equals(lion2));
        System.out.println(lion.equals(zebra));
        System.out.println(lion.hashCode());
        System.out.println(zebra.hashCode());
    }
}
