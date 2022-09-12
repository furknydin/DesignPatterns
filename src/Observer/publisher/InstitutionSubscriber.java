package Observer.publisher;

public class InstitutionSubscriber implements Subscriber{
    private String name;

    public InstitutionSubscriber(String name) {
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
        putOnShelf(publication);
    }

    public void putOnShelf(Publication publication){
        System.out.println(publication.getName()+ " is on the shelf of "+name);
    }
}
