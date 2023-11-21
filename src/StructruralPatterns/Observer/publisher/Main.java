package StructruralPatterns.Observer.publisher;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Publication newsweek = publisher.getNewsweek();
        Publication fourFourTwo = publisher.getFourFourTwo();

        Subscriber furkan = new IndividualSubscriber("Furkan");
        newsweek.addSubscriber(furkan);
        fourFourTwo.addSubscriber(furkan);

        Subscriber ali = new IndividualSubscriber("Ali");
        newsweek.addSubscriber(ali);

        Subscriber obss = new InstitutionSubscriber("OBSS");
        fourFourTwo.addSubscriber(obss);

        publisher.publishNewsweek();
        publisher.publishFourFourTwo();
        publisher.publishFourFourTwo();
        publisher.publishNewsweek();
    }
}
