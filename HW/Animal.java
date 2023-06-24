package HW8;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean hasTail;

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: " + (hasTail ? "так" : "ні");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Animal other = (Animal) obj;
        if(name != other.name) return false;
        if(age != other.age) return false;
        if(hasTail != other.hasTail) return false;

        return  true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }
}
