package boundary;

import control.Control_Login;
import control.Control_NewUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUI_NewUser extends JFrame implements ActionListener
{
    private JTextField addressText;
    private JTextField telephoneText;
    private JTextField passportText;
    private JTextField userText;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JFrame frame;
    private JButton backButton;

    public void displayGUI() {
        
        frame = new JFrame("Register here");
        frame.setSize(350, 250);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        frame.add(panel);

        JLabel userLabel = new JLabel("User Name");
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

        JLabel addressLabel = new JLabel("Address");
        userLabel.setBounds(10, 70, 80, 25);
        panel.add(addressLabel);

        addressText = new JTextField(20);
        addressText.setBounds(100, 70, 160, 25);
        panel.add(addressText);

        JLabel telephoneLabel = new JLabel("Telephone");
        telephoneLabel.setBounds(10, 100, 80, 25);
        panel.add(telephoneLabel);

        telephoneText = new JTextField(20);
        telephoneText.setBounds(100, 100, 160, 25);
        panel.add(telephoneText);

        JLabel passportLabel = new JLabel("Passport Number");
        passportLabel.setBounds(10, 130, 80, 25);
        panel.add(passportLabel);

        passportText = new JTextField(20);
        passportText.setBounds(100, 130, 160, 25);
        panel.add(passportText);

        registerButton = new JButton("register");
        registerButton.setBounds(10, 160, 80, 25);
        panel.add(registerButton);

        JLabel m = new JLabel("Manager");
        panel.add(m);
        JCheckBox cbxManager = new JCheckBox();
        panel.add(cbxManager);

        JLabel g = new JLabel("Guest");
        panel.add(g);
        JCheckBox cbxGuest = new JCheckBox();
        panel.add(cbxGuest);

        JLabel r = new JLabel("Receptionist");
        panel.add(r);
        JCheckBox cbxReceptionist = new JCheckBox();
        panel.add(cbxReceptionist);

        backButton = new JButton("back");
        backButton.setBounds(10, 160, 160, 25);
        panel.add(backButton);

        backButton.addActionListener(this);
        registerButton.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == registerButton)
        {
            String address = addressText.getText();
            String tel = telephoneText.getText();
            String password = passwordField.toString();
            String username = userText.getText();
            String passport = passportText.getText();
            if((!address.equalsIgnoreCase("") && (!tel.equalsIgnoreCase("")) && (!passport.equalsIgnoreCase("")) && (!username.equalsIgnoreCase("")) && (!password.equalsIgnoreCase(""))))
            {
                Control_NewUser control_newUser = new Control_NewUser(username, password, address, passport, tel);
                frame.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You must enter all fields..", "Try Again", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == backButton)
        {
            Control_Login control_login = new Control_Login();
            frame.dispose();

        }

    }
}
    