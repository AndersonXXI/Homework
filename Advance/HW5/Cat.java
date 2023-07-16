package L5.HW_5;

import java.lang.reflect.Field;

public class Cat extends Animal{
    public Cat(String name, int age, boolean other) {
        super(name, age, other);
    }
    public void changeAnimalFields() throws IllegalAccessException {
        Animal animal = new Animal("Lion", 5, true);

        Field[] fields = Animal.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(this, field.get(animal));
        }
    }
}
