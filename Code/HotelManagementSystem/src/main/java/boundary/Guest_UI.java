package boundary;

import control.Login_Controller;
import roomDecorator.Room_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Guest_UI extends JFrame implements ActionListener {
    private JButton logOutButton;
    private JFrame frame;
    private JButton browseButton;
    private JButton reservationButton;
    private JPanel panel;

    public Guest_UI()
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
            Login_Controller loginController = new Login_Controller();

            frame.dispose();
        }

        else if(e.getSource() == browseButton)
        {
            Room_Controller roomController = new Room_Controller();

            JOptionPane.showMessageDialog(null, roomController.displayAllRooms(), "Displaying available rooms", JOptionPane.INFORMATION_MESSAGE);

        }

        else if(e.getSource() == reservationButton)
        {
            Reservation_UI gui_reservation = new Reservation_UI();
            gui_reservation.displayGUI();

            frame.dispose();
        }
    }
}