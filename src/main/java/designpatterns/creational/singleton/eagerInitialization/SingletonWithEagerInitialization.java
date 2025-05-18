package designpatterns.creational.singleton.eagerInitialization;

public class SingletonWithEagerInitialization {

    private static final SingletonWithEagerInitialization singletonWithEagerInitialization = new SingletonWithEagerInitialization();

    private SingletonWithEagerInitialization(){
        System.out.println("SingletonWithEagerInitialization instance created.");
    }

    public static SingletonWithEagerInitialization getinstance(){
        return singletonWithEagerInitialization;
    }

    public void getDetails(){
        System.out.println("hashcode: " + singletonWithEagerInitialization.hashCode());
    }
}
