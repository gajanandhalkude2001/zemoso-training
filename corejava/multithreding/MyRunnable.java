package corejava.multithreding;
class Runnables implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
    public class MyRunnable {
        public static void main(String args[]) throws InterruptedException {
            Thread thread1 = new Thread(new Runnables());
            thread1.start();

            System.out.println(thread1.isAlive());
            thread1.join();

            Thread thread2 = new Thread(new Runnables());
            thread2.start();
            System.out.println(thread2.isAlive());
        }
    }

