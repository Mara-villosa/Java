public class Main {
    public static void main(String[] args) {

        Product [] products = new Product[8];

        products[0] = new Dairy("Soymilk", 0.99f, 1, 2);
        products[1] = new Dairy("Mango Yogurt", 1.99f, 4, 8);
        products[2] = new Fruit("Apple", 1.99, 1, "Red");
        products[3] = new Fruit("Orange", 2.39, 1.6, "Orange");
        products[4] = new Cleaning("Bleach", 4.99, "Bleach, Aromatics", 2);
        products[5] = new Cleaning("Amonia", 3.99, "Amonia, Aromatics", 1);
        products[6] = new NonPerishable("Beans", 0.99, 2, 2);
        products[7] = new NonPerishable("Rice", 1.99, 4, 2);

        for(Product product : products)
        {
            //Habría que hacer esto con todos los tipos de la clase pero me da pereza vaya
            if(product instanceof Dairy) {
                Dairy aux = (Dairy) product;
                System.out.println(aux.name + " " + aux.price + " " + aux.);
            }
        }

    }
}
