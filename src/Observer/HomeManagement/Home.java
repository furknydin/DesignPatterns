package Observer.HomeManagement;

public class Home {
    private Observable sun;
    private Observable temperature;

    public Home() {
        sun = new Sun("Sun");
        temperature = new Temperature("Temperature");
    }

    public void changeSun(boolean state){
        System.out.println("Sun state is changing");
        sun.update(state);
        sun.publish();
    }

    public void changeTemperature(double state){
        System.out.println("Temperature is changing");
        temperature.update(state);
        temperature.publish();
    }

    public Observable getSun() {
        return sun;
    }

    public Observable getTemperature() {
        return temperature;
    }
}
