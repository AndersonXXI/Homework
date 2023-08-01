package HW8_3;

public class PriorityRunner {
    public static void main(String[] args) {

        PriorityThread minPriorityThread = new PriorityThread("min", Thread.MIN_PRIORITY);
        PriorityThread maxPriorityThread = new PriorityThread("max", Thread.MAX_PRIORITY);
        PriorityThread normPriorityThread = new PriorityThread("norm", Thread.NORM_PRIORITY);

        minPriorityThread.start();
        maxPriorityThread.start();
        normPriorityThread.start();
    }


    static class PriorityThread extends Thread {
        private String threadName;

        public PriorityThread(String threadName, int priority) {
            this.threadName = threadName;
            setPriority(priority);
        }

        @Override
        public void run() {
            for (int i = 1; i <= 50; i++) {
                System.out.println("Потік " + threadName + ", значення: " + i);
            }
        }
    }
}
