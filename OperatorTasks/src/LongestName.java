import javax.swing.*;

public class LongestName {
    public static void main(String[] args) {
        String [] names = new String[3];
        String [] splitNames = new String[3];
        int maxLength = 0;
        int longestNameIndex = -1;

        names[0] = JOptionPane.showInputDialog("Input the first name and surname");
        splitNames[0] = names[0].split(" ")[0];

        names[1] = JOptionPane.showInputDialog("Input the second name and surname");
        splitNames[1] = names[1].split(" ")[0];

        names[2] = JOptionPane.showInputDialog("Input the third name and surname");
        splitNames[2] = names[2].split(" ")[0];

        for(int i = 0; i < splitNames.length; i++)
        {
            if(splitNames[i].length() > maxLength)
            {
                longestNameIndex = i;
                maxLength = splitNames[i].length();
            }
        }

        if(longestNameIndex == -1) JOptionPane.showMessageDialog(null, "Error");
        else
            JOptionPane.showMessageDialog(null, "El nombre más largo es: " + names[longestNameIndex]);

    }
}
