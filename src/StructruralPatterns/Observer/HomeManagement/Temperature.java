package StructruralPatterns.Observer.HomeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperature implements Observable {
    private String name;
    private Double temperature;
    private List<Observer> observers;

    public Temperature(String name) {
        this.name = name;
        temperature = 0.0;
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
    public void update(Object temperature) {
        this.temperature = (Double) temperature;
    }

    @Override
    public void publish() {
        Iterator<Observer> iterator = observers.iterator();

        while (iterator.hasNext()){
            Observer notify = iterator.next();
            notify.receive(this);
        }
    }

    @Override
    public Object getState() {
        return temperature;
    }

}
