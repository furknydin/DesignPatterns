package CreationalPatterns.AbstractFactory.Hotel;

public class Test {
    public static void main(String[] args) {
        System.out.println("Luxery Hotel Test\n\n");
        new Client(new LuxeryHotelFactory());
        System.out.println("\n\n");

        System.out.println("Economical Hotel Test\n\n");
        new Client(new EconomicalHotelFactory());
        System.out.println("\n\n");

        System.out.println("TimeSharing Test\n\n");
        new Client(new TimeShareHotelFactory());
        System.out.println("\n\n");
    }
}
