import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateComparer {
    public static void main(String[] args) throws ParseException {
        int userAge = 0;

        String userInput = JOptionPane.showInputDialog(null, "Input your birthdate in the format dd-mm-yyy");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar userCalendar = Calendar.getInstance();
        userCalendar.setTime(dateFormat.parse(userInput));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        if(calendar.get(Calendar.MONTH) >= userCalendar.get(Calendar.MONTH))
        {
            if(calendar.get(Calendar.DAY_OF_MONTH) >= userCalendar.get(Calendar.DAY_OF_MONTH))
            {
                userAge = calendar.get(Calendar.YEAR) - userCalendar.get(Calendar.YEAR);
            }
        }
        else
            userAge = (calendar.get(Calendar.YEAR) - userCalendar.get(Calendar.YEAR)) - 1;

        JOptionPane.showMessageDialog(null, "User age: " + userAge);
    }
}
