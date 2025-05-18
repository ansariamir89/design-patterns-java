package designpatterns.creational.singleton.synchronization;

public class SingletonWithSynchronization {

    private static SingletonWithSynchronization singletonWithSynchronization;

    private SingletonWithSynchronization(){
        System.out.println("SingletonWithSynchronization instance created.");
    }

    public static synchronized SingletonWithSynchronization getInstance(){

        if(null == singletonWithSynchronization){
            singletonWithSynchronization = new SingletonWithSynchronization();
        }

        return singletonWithSynchronization;
    }


    public void getDetails(){
        System.out.println("hashcode: " + singletonWithSynchronization.hashCode());
    }
}
