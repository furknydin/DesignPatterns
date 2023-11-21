package StructruralPatterns.Observer.publisher;

public interface Publication {
    public void setName(String name);
    public String getName();
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void publish(String date);
}
