package designpatterns.creational.singleton.withenum;

public enum SingletonWithEnum {

    SINGLETON;

    public void getDetails(){
        System.out.println("hashcode: " + SINGLETON.hashCode());
    }
}
