public class Fruit extends Product{

    private double weight;
    private String color;

    Fruit(String name, double price, double weight, String color)
    {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }
}
