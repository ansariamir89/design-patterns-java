package designpatterns.creational.singleton.doublecheckedlocking;

public class SingletonWithDoubleCheckLock {

    private static SingletonWithDoubleCheckLock singletonWithDoubleCheckLock;

    private SingletonWithDoubleCheckLock(){
        System.out.println("SingletonWithDoubleCheckLock instance created.");
    }

    public static SingletonWithDoubleCheckLock getInstance(){
        if(null == singletonWithDoubleCheckLock){
            synchronized (SingletonWithDoubleCheckLock.class){
                if(null == singletonWithDoubleCheckLock){
                    singletonWithDoubleCheckLock = new SingletonWithDoubleCheckLock();
                }
            }
        }
        return singletonWithDoubleCheckLock;
    }

    public void getDetails(){
        System.out.println("hashcode: " + singletonWithDoubleCheckLock.hashCode());
    }
}
