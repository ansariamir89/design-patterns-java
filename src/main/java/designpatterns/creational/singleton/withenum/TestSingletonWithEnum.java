package designpatterns.creational.singleton.withenum;

import designpatterns.creational.singleton.eagerInitialization.SingletonWithEagerInitialization;

public class TestSingletonWithEnum {

    public static void main(String[] args) {
        SingletonWithEnum singleton1 = SingletonWithEnum.SINGLETON;
        SingletonWithEnum singleton2 = SingletonWithEnum.SINGLETON;

        singleton1.getDetails();
        singleton2.getDetails();
    }
}
