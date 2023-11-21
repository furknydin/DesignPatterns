package StructruralPatterns.Observer.publisher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewsWeek implements Publication{
    private String name;
    private List<Subscriber> subscribers;

    public NewsWeek(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
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
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void publish(String date) {
        name = name + " - "+ date;
        Iterator<Subscriber> iterator = subscribers.iterator();
        while (iterator.hasNext()){
            Subscriber subscriber = iterator.next();
            subscriber.receive(this);
        }
    }

    public void listSubscriber(){
        Iterator<Subscriber> iterator = subscribers.iterator();
        while (iterator.hasNext()){
            System.out.println((Subscriber)iterator.next());
        }
    }

}
