package StructruralPatterns.Observer.HomeManagement;

public class Main {
    public static void main(String[] args) {
        Home home = new Home();

        Observable sun = home.getSun();
        Observable temperature = home.getTemperature();

        Observer window = new Window("Window");
        Observer curtain = new Curtain("Curtain");
        Observer airConditioner = new AirConditioner("Air Conditioner");

        sun.addObserver(curtain);
        temperature.addObserver(window);
        temperature.addObserver(airConditioner);

        home.changeSun(true);

        home.changeTemperature(21.0);
        home.changeTemperature(25.0);
        home.changeTemperature(28.0);
        home.changeTemperature(32.0);

        home.changeSun(false);

        home.changeTemperature(30.0);
        home.changeTemperature(28.0);
        home.changeTemperature(25.0);
        home.changeTemperature(21.0);
        home.changeTemperature(18.0);
    }

}
