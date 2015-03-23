package boundary;

import javax.swing.*;


public class WelcomePage extends JFrame {

    public static void main(String[] args) {
        WelcomePage frameTabel = new WelcomePage();
    }

    JLabel lblWelcome = new JLabel("Welcome to Hotel System!");
    JPanel panel = new JPanel();

    public WelcomePage(){
        super("Welcome");
        setSize(300,200);
        setLocation(500,280);
        panel.setLayout(null);

        lblWelcome.setBounds(70, 50, 150, 60);

        panel.add(lblWelcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}