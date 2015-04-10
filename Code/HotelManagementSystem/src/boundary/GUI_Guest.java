package boundary;

import control.Control_Login;
import control.Control_Room;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUI_Guest extends JFrame implements ActionListener {
    private JButton logOutButton;
    private JFrame frame;
    private JButton browseButton;
    private JButton reservationButton;
    private JPanel panel;

    public GUI_Guest()
    {

    }
    
    public void displayGUI(String username)
    {
        frame = new JFrame("Guest Menu");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);

        JLabel userLabel = new JLabel("Welcome to guest menu : " + username);
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        browseButton = new JButton("Browse Rooms");
        browseButton.setBounds(10, 80, 160, 25);
        panel.add(browseButton);

        reservationButton = new JButton("Make Reservation");
        reservationButton.setBounds(10, 100, 160, 25);
        panel.add(reservationButton);

        //create new button
        logOutButton = new JButton("log out");
        logOutButton.setBounds(10, 120, 160, 25);
        panel.add(logOutButton);

        logOutButton.addActionListener(this);
        browseButton.addActionListener(this);
        reservationButton.addActionListener(this);

        frame.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logOutButton)
        {
            Control_Login control_login = new Control_Login();
            frame.dispose();
        }

        else if(e.getSource() == browseButton)
        {
            Control_Room control_room = new Control_Room();

            JOptionPane.showMessageDialog(null, control_room.displayAvailableRooms(), "Displaying available rooms", JOptionPane.INFORMATION_MESSAGE);

        }

        else if(e.getSource() == reservationButton)
        {
            GUI_Reservation gui_reservation = new GUI_Reservation();
            gui_reservation.displayGUI();

            frame.dispose();
        }
    }
}