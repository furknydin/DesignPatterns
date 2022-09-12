package Decorator.ArmourDefence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing 1 is started.....\n");
        Main.test1();
        System.out.println("---------------------------\n");

        System.out.println("Testing 2 is started.....\n");
        Main.test2();
        System.out.println("---------------------------\n");

        System.out.println("Testing 3 is started.....\n");
        Main.test3();
        System.out.println("---------------------------\n");
    }

    public static void test1(){
        ArmourComponents torDesign = new Tor();
        torDesign = new RocketLauncher(torDesign);
        torDesign = new AutoRifle(torDesign);
        torDesign = new Laser(torDesign);

        System.out.println(torDesign.calculatePrice());
        System.out.println(torDesign.calculateWeight());
    }
    public static void test2(){
        ArmourComponents decDesign = new Dec();
        decDesign = new Flamethrower(decDesign);
        decDesign = new RocketLauncher(decDesign);
        decDesign = new Laser(decDesign);
        decDesign = new Flamethrower(decDesign);

        System.out.println(decDesign.calculatePrice());
        System.out.println(decDesign.calculateWeight());

    }
    public static void test3(){
        ArmourComponents oraDesign = new Ora();
        oraDesign = new Flamethrower(oraDesign);
        oraDesign = new RocketLauncher(oraDesign);
        oraDesign = new AutoRifle(oraDesign);
        oraDesign = new RocketLauncher(oraDesign);

        System.out.println(oraDesign.calculatePrice());
        System.out.println(oraDesign.calculateWeight());
    }

}
