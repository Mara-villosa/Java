import javax.swing.*;

public class GasolineTank {
    public static void main(String[] args) {
        int maxGasoline = 70;
        int currentGas = 0;

        currentGas = Integer.parseInt(JOptionPane.showInputDialog("Input the current amount of gas in the tank"));

        if(currentGas >= maxGasoline)
            JOptionPane.showMessageDialog(null, "Tank Full");

        else if(currentGas >= 60 && currentGas < maxGasoline)
            JOptionPane.showMessageDialog(null, "Tank almost full");

        else if(currentGas >= 40 && currentGas < 60)
            JOptionPane.showMessageDialog(null, "Tank at 3/4 capacity");

        else if(currentGas >= 35 && currentGas < 40)
            JOptionPane.showMessageDialog(null, "Tank at half capacity");

        else if(currentGas >= 20 && currentGas < 35)
            JOptionPane.showMessageDialog(null, "Enough gas");

        else if(currentGas >= 1 && currentGas < 20)
            JOptionPane.showMessageDialog(null, "Not enough");
    }
}
