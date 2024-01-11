import javax.swing.*;
import java.util.Scanner;

public class Main {
    static String billName = "";
    static double price1 = 0.0;
    static double price2 = 0.0;
    static double totalPrice = 0.0;
    static double taxPercentage = 0.19;
    static double taxAmount = 0.0;

    public static void main(String[] args) {
        ScannerBill();
        SwingBill();
    }

    public static void ScannerBill(){
        System.out.println("Input the name of your bill");
        Scanner sc = new Scanner(System.in);
        billName = sc.nextLine();

        System.out.println("Input the price of the first item");
        price1 = sc.nextDouble();

        System.out.println("Input the price of the second item");
        price2 = sc.nextDouble();

        totalPrice = price1 + price2;

        taxAmount = totalPrice * taxPercentage;

        System.out.println("Your bill for " + billName + " amounts to " + totalPrice + " before taxes\n" + "You have to pay "
                + taxAmount + " as taxes, bringing the total amount to " + (taxAmount + totalPrice));
    }

    public static void SwingBill(){
        billName = JOptionPane.showInputDialog(null, "Input the name of your bill");

        price1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the price of the first item"));

        price2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the price of the second item"));

        totalPrice = price1 + price2;

        taxAmount = totalPrice * taxPercentage;

        JOptionPane.showMessageDialog(null, "Your bill for " + billName + " amounts to s" + totalPrice + " before taxes\n" + "You have to pay "
                + taxAmount + " as taxes, bringing the total amount to " + (taxAmount + totalPrice));
    }
}
