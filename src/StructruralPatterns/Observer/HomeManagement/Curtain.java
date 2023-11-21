package StructruralPatterns.Observer.HomeManagement;

public class Curtain implements Observer{
    private String name;

    public Curtain(String name) {
        this.name = name;
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
        if ((Boolean) observable.getState()){
            open();
        }else{
            close();
        }
    }

    private void open(){
        System.out.println("The sun has risen. Curtain is opening");
    }

    private void close(){
        System.out.println("Sun is down. Curtain is closing");
    }
}
