package Singleton;

public class Main extends Thread{
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            Main thread = new Main();
            thread.start();
        }*/


    }

    @Override
    public void run() {
        try{

            BillPughSingleton singleton = BillPughSingleton.getInstance();
            System.out.println(BillPughSingleton.getCounter());
        }catch (Exception e){
            System.out.println("Threadde hata aldık");
        }
    }
}
