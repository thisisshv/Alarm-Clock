import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Clock clock = new Clock();
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);
        frame.setTitle("Alarm Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 20, 600, 600);
        frame.setResizable(false);
        frame.add(clock);
    }
}