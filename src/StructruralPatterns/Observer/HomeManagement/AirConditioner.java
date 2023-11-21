package StructruralPatterns.Observer.HomeManagement;

public class AirConditioner implements Observer{
    public String name;
    private boolean state;
    public AirConditioner(String name) {
        this.name = name;
        this.state = false;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receive(Observable observable) {
        if((Double)observable.getState() > 30.0){
            open(observable);
        }else{
            close(observable);
        }
    }

    private void open(Observable observable){
        if(state){
            System.out.println("Temperature is "+observable.getState()+". Air conditioner already open");
        }else {
            System.out.println("Temperature is "+observable.getState()+". Air conditioner is opening");
            state = true;
        }
    }

    private void close(Observable observable){
        if(state){
            System.out.println("Temperature is "+observable.getState()+". Air conditioner is closing");
            state = false;
        }else {
            System.out.println("Temperature is "+observable.getState()+". Air conditioner already close");
        }
    }
}
