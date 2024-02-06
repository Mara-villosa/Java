public class NonPerishable extends Product{

    private int content;
    private int calories;

    NonPerishable(String name, double price, int content, int calories)
    {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }
}
