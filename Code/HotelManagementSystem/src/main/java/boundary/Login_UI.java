package boundary;

import control.Login_Controller;
import userFactory.NewUser_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_UI extends JFrame implements ActionListener {

    private static JFrame frame;
    private static JButton loginButton, registerButton;
    private static JPasswordField passwordField;
    private static JTextField userText;
    private String username, password;

    public Login_UI()
    {

    }

    public Login_UI(String username, String password) {
        if (username == null || username.equalsIgnoreCase("") || password == null || password.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "Error: You Must Enter ALL Details\nPlease try again!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Error: User Does Not Exist\nPlease Register or try again!", "Login Failed", JOptionPane.ERROR_MESSAGE);

    }

    public void displayGUI() {

        frame = new JFrame("Hotel JJ Login Panel");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 40, 160, 25);
        panel.add(passwordField);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        registerButton = new JButton("register");
        registerButton.setBounds(180, 80, 80, 25);
        panel.add(registerButton);

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

            password =  passwordField.getText();
            username = userText.getText();
            frame.dispose();

            // pass 2 Strings to control.Control_Login object
            Login_Controller dataTransfer = new Login_Controller(username, password);
            dataTransfer.login();
        } else if (e.getSource() == registerButton) {
            // pass control over to Control_newUser
            NewUser_Controller newUserController = new NewUser_Controller();
            // close frame
            frame.dispose();
        }
    }

}