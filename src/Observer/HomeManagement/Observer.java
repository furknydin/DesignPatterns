package Observer.HomeManagement;

public interface Observer {
    public void setName(String name);
    public String getName();
    public void receive(Observable observable);
}
