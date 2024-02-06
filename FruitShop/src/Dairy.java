public class Dairy extends Product{

    private int amount;
    private int proteins;

    Dairy(String name, double price, int amount, int proteins)
    {
        super(name, price);
        this.amount = amount;
        this.proteins = proteins;
    }
}
