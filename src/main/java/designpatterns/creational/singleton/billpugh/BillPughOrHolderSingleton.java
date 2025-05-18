package designpatterns.creational.singleton.billpugh;

public class BillPughOrHolderSingleton {

    private BillPughOrHolderSingleton(){
        System.out.println("BillPughOrHolderSingleton instance created.");
    }

    public static BillPughOrHolderSingleton getInstance(){
        return BillPughOrHolderSingletonHelper.SINGLETON;
    }


    public void getDetails(){
        System.out.println("hashcode: " + this.hashCode());
    }

    private static class BillPughOrHolderSingletonHelper{
        private static final BillPughOrHolderSingleton SINGLETON = new BillPughOrHolderSingleton();
    }
}
