import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLAbel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> LoginInfoOriginal){
        logininfo = LoginInfoOriginal;
        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        messageLAbel.setBounds(125,250,250,35);
        messageLAbel.setFont(new Font(null,Font.ITALIC,25));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        resetButton.setBounds(225,200,100,25);
        loginButton.setFocusable(false);
        resetButton.addActionListener(this);



        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLAbel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton){
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            if(logininfo.containsKey(userID)){
                if (logininfo.get(userID).equals(password)){
                    messageLAbel.setForeground(Color.green);
                    messageLAbel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else{
                    messageLAbel.setForeground(Color.red);
                    messageLAbel.setText("Wrong Password");
                }
            }
            else{
                messageLAbel.setForeground(Color.red);
                messageLAbel.setText("user not found");
            }

        }
    }
}
