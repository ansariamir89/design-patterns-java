package designpatterns.creational.singleton.doublecheckedlocking;

public class TestSingletonWithDoubleCheckLock {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                SingletonWithDoubleCheckLock singleton = SingletonWithDoubleCheckLock.getInstance();
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
