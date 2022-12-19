import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Clock extends JPanel {

    Calendar calender;
    SimpleDateFormat timeformat;
    JLabel timeLabel;

    // To store the time in the String
    String time;

    public Clock() {

        timeformat = new SimpleDateFormat("hh:mm:ss");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 25));
        time = timeformat.format(Calendar.getInstance().getTime());
        timeLabel.setText("Current time: " + time);
        // setTime();

    }

    // public void setTime() {
    // while (true) {
    // time = timeformat.format(Calendar.getInstance().getTime());
    // timeLabel.setText("Current time: " + time);

    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // }

}
