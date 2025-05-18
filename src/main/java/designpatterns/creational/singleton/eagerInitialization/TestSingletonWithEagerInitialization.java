package designpatterns.creational.singleton.eagerInitialization;

public class TestSingletonWithEagerInitialization {

    public static void main(String[] args) {

        SingletonWithEagerInitialization singleton1 = SingletonWithEagerInitialization.getinstance();
        SingletonWithEagerInitialization singleton2 = SingletonWithEagerInitialization.getinstance();

        singleton1.getDetails();
        singleton2.getDetails();
    }

}
