package Observer.HomeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sun implements Observable {
    private String name;
    private Boolean state;
    private List<Observer> observers;

    public Sun(String name) {
        this.name = name;
        state = false;
        observers = new ArrayList<>();
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
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update(Object state) {
        this.state = (Boolean) state;
    }

    /**
     * stream api while döngüsü
     */
    @Override
    public void publish() {
        observers.forEach(observer -> observer.receive(this));

    }

    @Override
    public Object getState() {
        return state;
    }
}
