package HW8_7;

 class DaemonRunnable implements Runnable {
    @Override
    public void run() {
        try {

            while (true) {
                System.out.println("Демон-потік працює...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
