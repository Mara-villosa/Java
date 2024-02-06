public class Cleaning extends Product{

    private String components;
    private double liters;

    Cleaning(String name, double price, String components, double liters)
    {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }
}
