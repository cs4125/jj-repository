package boundary;

import controlpkge.ControlClass;

import javax.swing.*;
import java.awt.event.*;

public class Driver extends JFrame {

    public static void main(String[] args) {
        Driver frameTable = new Driver();
    }

    JButton btnLogin = new JButton("Login");
    JPanel panel = new JPanel();
    JTextField txtUser = new JTextField(15);
    JPasswordField txtPass = new JPasswordField(15);

    Driver(){
        super("Login Menu");
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout (null);


        txtUser.setBounds(70, 30, 150, 20);
        txtPass.setBounds(70, 65, 150, 20);
        btnLogin.setBounds(110, 100, 80, 20);

        panel.add(btnLogin);
        panel.add(txtUser);
        panel.add(txtPass);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionLogin();
    }

    public void actionLogin(){
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String username = txtUser.getText();
                String password = txtPass.getText();
                if (username.equals("jim") && password.equals("123")) {
                    WelcomePage regFace = new WelcomePage();

                    // call public Control constructor
                    ControlClass bControl;

                    // login passed to Control constructor
                    bControl = new ControlClass(username, password);
                    regFace.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                    txtUser.setText("");
                    txtPass.setText("");
                    txtUser.requestFocus();
                }
            }
        });
    }
}



