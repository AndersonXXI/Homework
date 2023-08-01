package HW8_5;

public class DeadlockExample {
    Class1 class1 = new Class1();
    Class2 class2 = new Class2();


    Thread thread1 = new Thread(() -> {
        synchronized (class1) {
            System.out.println("Thread1 блокує Class1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (class2) {
                System.out.println("Thread1 блокує Class2");
            }
        }
    });

    Thread thread2 = new Thread(() -> {
        synchronized (class2) {
            System.out.println("Thread2 блокує Class2");
            synchronized (class1) {
                System.out.println("Thread2 блокує Class1");
            }
        }
    });


}

