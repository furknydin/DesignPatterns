package CreationalPatterns.AbstractFactory.GUI;

public class Test {
    public static void main(String[] args) {
        new Client(createOsSpecificFactory());
    }

    public static AbstractGUIFactory createOsSpecificFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile(String string) {
        int i = 0;
        double random = Math.random();
        if(random > 0.5)
            i = 1;
        return i;
    }
}