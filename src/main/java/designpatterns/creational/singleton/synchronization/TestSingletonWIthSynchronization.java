package designpatterns.creational.singleton.synchronization;

public class TestSingletonWIthSynchronization {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                SingletonWithSynchronization singleton = SingletonWithSynchronization.getInstance();
                Thread.sleep(5000);
                singleton.getDetails();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
