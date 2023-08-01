package HW8_4;

public class SynchronizationExample {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                class1.printValue(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                class2.printValue(i);
            }
        });

        thread1.start();
        thread2.start();
}
}
