package L5.HW_5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 3, false);

        System.out.println("Перед зміною полів Animal: ");
        cat.printInfo();

        try {
            cat.changeAnimalFields();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("Після зміни полів Animal:");
        cat.printInfo();
    }
}
