package StructruralPatterns.Observer.publisher;

public interface Subscriber {

    public void setName(String name);
    public String getName();
    public void receive(Publication publication);
}
