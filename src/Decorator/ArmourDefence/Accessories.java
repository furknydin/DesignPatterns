package Decorator.ArmourDefence;

import java.util.List;

/***
 * Abstract olma sebebi instace oluşturmayı önlemek.
 */
public abstract class Accessories implements ArmourComponents{
    private String name;
    private ArmourComponents components;
    private int price;

    private double weight;


    public Accessories(ArmourComponents components,String name, int price,double weight) {
        this.name = name;
        this.components = components;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int calculatePrice() {
        return components.calculatePrice()+price;
    }

    @Override
    public List<Accessories> getAccessories() {
        List<Accessories> accessories = components.getAccessories();
        accessories.add(this);

        return accessories;
    }

    @Override
    public double calculateWeight() {
        return components.calculateWeight()+weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ArmourComponents getComponents() {
        return components;
    }



    public void setComponents(ArmourComponents components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
