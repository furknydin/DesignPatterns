package Observer.publisher;

public class IndividualSubscriber implements Subscriber{
    private String name;

    public IndividualSubscriber(String name) {
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
    public void receive(Publication publication) {
        read(publication);
    }

    public void read(Publication publication){
        System.out.println(name + " is reading "+publication.getName());
    }
}
