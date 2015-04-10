package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI_Receptionist extends JFrame implements ActionListener
{
    public void displayGUI()
    {
        JFrame frame = new JFrame("Receptionist Menu");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
