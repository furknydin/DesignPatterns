package StructruralPatterns.Observer.HomeManagement;

public class Window implements Observer{
    public String name;
    private boolean state;

    public Window(String name) {
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
        if((Double)observable.getState() > 25.0){
            open(observable);
        }else{
            close(observable);
        }
    }

    private void open(Observable observable){
        if(state){
            System.out.println("Temperature is "+observable.getState()+". Window already open");
        }else {
            System.out.println("Temperature is "+observable.getState()+". Window is opening");
            state = true;
        }
    }

    private void close(Observable observable){
        if(state){
            System.out.println("Temperature is "+observable.getState()+". Window is closing");
            state = false;
        }else {
            System.out.println("Temperature is "+observable.getState()+". Window already close");
        }
    }
}
