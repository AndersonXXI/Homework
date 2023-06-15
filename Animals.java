package HW_6;

public enum Animals {
    CAT(2),
    DOG(3),
    ELEPHANT(10);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " (Age: " + age + ")";
    }
}
