package designpatterns.creational.singleton.lazyInitialization;

public class SingletonWithLazyInitialization {

    private static SingletonWithLazyInitialization singletonWithLazyInitialization;

    private SingletonWithLazyInitialization(){
        System.out.println("SingletonWithLazyInitialization instance created.");
    }

    public static SingletonWithLazyInitialization getInstance(){

        if(null == singletonWithLazyInitialization){
            singletonWithLazyInitialization = new SingletonWithLazyInitialization();
        }
        return singletonWithLazyInitialization;
    }

    public void getDetails(){
        System.out.println("hashcode: " + singletonWithLazyInitialization.hashCode());
    }
}
