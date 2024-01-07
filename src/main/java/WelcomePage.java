import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel WelcomeLabel = new JLabel("HELLO");

    WelcomePage(String userID){
        WelcomeLabel.setBounds(0,0,200,35);
        WelcomeLabel.setFont(new Font(null,Font.ITALIC,25));
        WelcomeLabel.setText("Hello"+userID);
        frame.add(WelcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
