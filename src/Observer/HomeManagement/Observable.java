package Observer.HomeManagement;

public interface Observable {
    public void setName(String name);
    public String getName();
    public Object getState();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void update(Object temperature);
    public void publish();
}
