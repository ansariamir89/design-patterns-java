package designpatterns.creational.singleton.lazyInitialization;

public class TestSingletonWithLazyInitialization {

    public static void main(String[] args) {

        SingletonWithLazyInitialization instance1 = SingletonWithLazyInitialization.getInstance();
        SingletonWithLazyInitialization instance2 = SingletonWithLazyInitialization.getInstance();
        instance1.getDetails();
        instance2.getDetails();
    }
}
