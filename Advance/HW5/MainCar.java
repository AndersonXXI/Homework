package L5.HW_5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainCar {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;


        Field[] fields = carClass.getDeclaredFields();
        System.out.println("Поля:");
        for (Field field : fields) {
            String name = field.getName();
            String type = field.getType().getSimpleName();
            String modifiers = java.lang.reflect.Modifier.toString(field.getModifiers());
            System.out.println("Ім'я: \"" + name + "\", Тип: \"" + type + "\", Модифікатор: \"" + modifiers + "\"");
        }


        Method[] methods = carClass.getDeclaredMethods();
        System.out.println("\nМетод:");
        for (Method method : methods) {
            String name = method.getName();
            String returnType = method.getReturnType().getSimpleName();
            String modifiers = java.lang.reflect.Modifier.toString(method.getModifiers());
            System.out.println("Ім'я: \"" + name + "\", Повертає тип: \"" + returnType + "\", Модифікатор: \"" + modifiers + "\"");
        }


        Constructor<?>[] constructors = carClass.getDeclaredConstructors();
        System.out.println("\nКонструктор:");
        for (Constructor<?> constructor : constructors) {
            String name = constructor.getName();
            String modifiers = java.lang.reflect.Modifier.toString(constructor.getModifiers());
            System.out.println("Ім'я: \"" + name + "\", Модифікатор: \"" + modifiers + "\"");
        }


        int classModifiers = carClass.getModifiers();
        System.out.println("\nМодифікатор доступу до класу: \"" + java.lang.reflect.Modifier.toString(classModifiers) + "\"");
    }
    }

