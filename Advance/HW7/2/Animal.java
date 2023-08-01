package HW7_2;

public class Animal {
    private String name;
    protected int age;
    public boolean other;

    public Animal(String name, int age, boolean other) {
        this.name = name;
        this.age = age;
        this.other = other;
    }

    public void printInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Знайомий: " + other);
    }
}
