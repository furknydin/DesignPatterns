package StructruralPatterns.Observer.publisher;

import java.util.Date;

public class Publisher {
    private Publication newsweek;
    private Publication fourFourTwo;

    public Publisher() {
        newsweek = new NewsWeek("Newsweek");
        fourFourTwo = new FourFourTwo("FourFourTwo");
    }

    public void publishNewsweek(){
        System.out.println("\n New Newsweek On The Way");
        Date date = new Date();
        newsweek.publish(date.toString());
    }

    public void publishFourFourTwo(){
        System.out.println("\n New FourFourTwo On The Way");
        Date date = new Date();
        fourFourTwo.publish(date.toString());
    }

    public Publication getNewsweek() {
        return newsweek;
    }

    public Publication getFourFourTwo() {
        return fourFourTwo;
    }
}
