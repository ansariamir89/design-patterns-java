package designpatterns.creational.singleton.billpugh;

public class TestBillPughOrHolderSingleton {

    public static void main(String[] args) {
        BillPughOrHolderSingleton singleton1 = BillPughOrHolderSingleton.getInstance();
        BillPughOrHolderSingleton singleton2 = BillPughOrHolderSingleton.getInstance();

        singleton1.getDetails();
        singleton2.getDetails();
    }
}
