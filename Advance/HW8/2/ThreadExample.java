package HW8_2;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(new FirstRunnable());
        Thread secondThread = new Thread(new SecondRunnable());

        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();

        System.out.println("Завершення потоку main");
    }


    static class FirstRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Завершення потоку first");
        }
    }

    static class SecondRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Завершення потоку second");
        }
    }
}
