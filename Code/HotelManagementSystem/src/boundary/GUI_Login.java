package boundary;

import control.Control_Login;
import control.Control_NewUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_Login extends JFrame implements ActionListener {

    private static JFrame frame;
    private static JButton loginButton, registerButton;
    private static JPasswordField passwordField;
    private static JTextField userText;
    private String username, password;

    public GUI_Login()
    {

    }

    public GUI_Login(String username, String password) {
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
            char input[] = passwordField.getPassword();
            password = new String(input);
            username = userText.getText();
            frame.dispose();

            // pass 2 Strings to control.Control_Login object
            Control_Login dataTransfer;
            dataTransfer = new Control_Login(username, password);
            dataTransfer.login();
        } else if (e.getSource() == registerButton) {
            // pass control over to Control_newUser
            Control_NewUser control_newUser = new Control_NewUser();
            // close frame
            frame.dispose();
        }
    }

}