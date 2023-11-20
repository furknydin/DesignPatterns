package CreationalPatterns.Singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class Singleton{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        private static int counter = 0;
    }

    public static BillPughSingleton getInstance(){
        Singleton.counter +=1;
        return Singleton.INSTANCE;
    }

    public static int getCounter()
    {
        return Singleton.counter;
    }
}
