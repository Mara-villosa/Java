import javax.swing.*;

public class OrderedNumbers {
    public static void main(String[] args) {

        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number"));

        if(num1 > num2)
            JOptionPane.showMessageDialog(null, num1 + " " + num2);

        else if (num1 == num2)
            JOptionPane.showMessageDialog(null, "Son iguales");

        else
            JOptionPane.showMessageDialog(null, num2 + " " + num1);
    }
}
