package HW8_7;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonRunnable());
        daemonThread.setDaemon(true);

        daemonThread.start();

        System.out.println("Основний потік запущено.");
    }
}

