package boundary;

import control.Login_Controller;
import control.Reservation_Controller;
import roomDecorator.Room_Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Receptionist_UI extends JFrame implements ActionListener
{
    private JButton logOutButton;
    private JFrame frame;
    private JButton browseButton;
    private JButton reservationButton;
    private JPanel panel;
    private JButton browseOccupiedButton;
    private JButton cancelReservationButton;
    private JButton viewCancelledButton;
    private JTextField txbRoom;
    private JButton browseAvailableButton;
    private JButton makeCancelledAvailableButton;

    public Receptionist_UI()
    {

    }

    public void displayGUI(String username)
    {
        frame = new JFrame("Receptionist Menu");
        frame.setSize(400, 400);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);

        JLabel userLabel = new JLabel("Welcome to Receptionist menu : " + username);
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        browseButton = new JButton("Browse Rooms");
        browseButton.setBounds(10, 80, 160, 25);
        panel.add(browseButton);

        browseOccupiedButton = new JButton("Browse Occupied Rooms");
        browseOccupiedButton.setBounds(10, 100, 80, 25);
        panel.add(browseOccupiedButton);

        reservationButton = new JButton("Make Reservation");
        reservationButton.setBounds(10, 120, 160, 25);
        panel.add(reservationButton);

        browseAvailableButton = new JButton("Browse Available Rooms");
        browseAvailableButton.setBounds(10, 140, 80, 25);
        panel.add(browseAvailableButton);

        txbRoom = new JTextField(6);
        txbRoom.setBounds(100, 160, 160, 25);
        panel.add(txbRoom);

        cancelReservationButton = new JButton("Cancel Reservation");
        cancelReservationButton.setBounds(10, 160, 80, 25);
        panel.add(cancelReservationButton);

        viewCancelledButton = new JButton("View Cancelled Reservations");
        viewCancelledButton.setBounds(10, 180, 160, 25);
        panel.add(viewCancelledButton);

        makeCancelledAvailableButton = new JButton("Refresh room");
        makeCancelledAvailableButton.setBounds(10, 180, 80, 25);
        panel.add(makeCancelledAvailableButton);

        //create new button
        logOutButton = new JButton("log out");
        logOutButton.setBounds(10, 200, 160, 25);
        panel.add(logOutButton);

        logOutButton.addActionListener(this);
        browseButton.addActionListener(this);
        reservationButton.addActionListener(this);
        browseOccupiedButton.addActionListener(this);
        viewCancelledButton.addActionListener(this);
        browseAvailableButton.addActionListener(this);
        cancelReservationButton.addActionListener(this);
        makeCancelledAvailableButton.addActionListener(this);

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

            JOptionPane.showMessageDialog(null, roomController.displayAllRooms(), "Displaying all rooms", JOptionPane.INFORMATION_MESSAGE);

        }

        else if(e.getSource() == browseAvailableButton)
        {
            Room_Controller roomController = new Room_Controller();

            JOptionPane.showMessageDialog(null, roomController.displayAvailableRooms(), "Displaying available rooms", JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getSource() == browseOccupiedButton)
        {
            Room_Controller roomController = new Room_Controller();

            JOptionPane.showMessageDialog(null, roomController.displayOccupiedRooms(), "Displaying occupied rooms", JOptionPane.INFORMATION_MESSAGE);

        }

        else if(e.getSource() == viewCancelledButton)
        {
            Room_Controller roomController = new Room_Controller();
            JOptionPane.showMessageDialog(null, roomController.displayCancelledRooms(), "Displaying cancelled rooms", JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getSource() == cancelReservationButton)
        {
            Reservation_Controller control_reservation = new Reservation_Controller(Integer.valueOf(txbRoom.getText()));
            control_reservation.cancelReservation();
        }

        else if(e.getSource() == reservationButton)
        {
            Reservation_Controller control_reservation = new Reservation_Controller(Integer.valueOf(txbRoom.getText()));
            control_reservation.reserveRoom();
        }

        else if(e.getSource() == makeCancelledAvailableButton)
        {
            Reservation_Controller control_reservation = new Reservation_Controller(Integer.valueOf(txbRoom.getText()));
            control_reservation.refreshReservation();
        }

    }
}
