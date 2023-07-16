package L5.HW_5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву класу: ");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);


            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Поля:");
            for (Field field : fields) {
                String name = field.getName();
                String type = field.getType().getSimpleName();
                String modifiers = java.lang.reflect.Modifier.toString(field.getModifiers());
                System.out.println("Ім'я: " + name + ", Тип: " + type + ", Модифікатор: " + modifiers);
            }


            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("\nМетоди:");
            for (Method method : methods) {
                String name = method.getName();
                String returnType = method.getReturnType().getSimpleName();
                String modifiers = java.lang.reflect.Modifier.toString(method.getModifiers());
                System.out.println("Ім'я: " + name + ", Повертає тип: " + returnType + ", Модифікатор: " + modifiers);
            }


            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("\nКонструктор:");
            for (Constructor<?> constructor : constructors) {
                String name = constructor.getName();
                String modifiers = java.lang.reflect.Modifier.toString(constructor.getModifiers());
                System.out.println("Ім'я: " + name + ", Модифікатор: " + modifiers);
            }


            int classModifiers = clazz.getModifiers();
            System.out.println("\nМодифікатор доступу до класу: " + java.lang.reflect.Modifier.toString(classModifiers));
        } catch (ClassNotFoundException e) {
            System.out.println("Клас не знайдено: " + className);
        }
    }
}
