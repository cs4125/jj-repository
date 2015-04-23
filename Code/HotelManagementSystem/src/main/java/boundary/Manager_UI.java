package boundary;

import control.Manager_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Manager_UI extends JFrame implements ActionListener {

    private static JButton deleteUserButton;
    private JFrame frame;

    public void displayGUI()
    {
        frame = new JFrame("Manager Menu");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Delete Guest: ann 999");
        userLabel.setBounds(10, 10, 200, 25);
        panel.add(userLabel);

        deleteUserButton = new JButton("Delete");
        deleteUserButton.setBounds(10, 40, 80, 25);
        panel.add(deleteUserButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
