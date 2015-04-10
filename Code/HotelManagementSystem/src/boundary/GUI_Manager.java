package boundary;

import control.Control_Manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_Manager extends JFrame implements ActionListener {

    private static JButton deleteUserButton;
    private JFrame frame;
    private String action, menuSelection;

    public void displayGUI()
    {
        frame = new JFrame("Manager Menu");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        addActions();
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel)
    {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Delete Guest: ann 999");
        userLabel.setBounds(10, 10, 200, 25);
        panel.add(userLabel);

        deleteUserButton = new JButton("Delete");
        deleteUserButton.setBounds(10, 40, 80, 25);
        panel.add(deleteUserButton);
    }

    private void addActions() {
        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // hardcoding : delete Guest ann 999 
                action = "deleteUser";
                menuSelection = "ann,999";
                Control_Manager dataTransfer;
                dataTransfer = new Control_Manager(action,menuSelection);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
