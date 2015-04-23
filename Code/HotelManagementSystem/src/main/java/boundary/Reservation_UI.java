package boundary;

import control.Reservation_Controller;
import roomDecorator.Room_Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reservation_UI extends JFrame implements ActionListener {
    private JButton backButton;
    private JFrame frame;
    private JButton browseButton;
    private JButton reservationButton;
    private static JTextField txbRoom;
    private JButton cancelReservationButton;

    // needs to load a Control object with selection
    public Reservation_UI()
    {

    }

    public void displayGUI()
    {
        frame = new JFrame("Reservation Menu");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel userLabel = new JLabel("Welcome to Reservation Menu");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        browseButton = new JButton("Browse Available Rooms");
        browseButton.setBounds(10, 80, 160, 25);
        panel.add(browseButton);

        reservationButton = new JButton("Reserve roomDecorator");
        reservationButton.setBounds(10, 100, 160, 25);
        panel.add(reservationButton);

        txbRoom = new JTextField(6);
        txbRoom.setBounds(100, 10, 160, 25);
        panel.add(txbRoom);

        cancelReservationButton = new JButton("Cancel Reservation");
        cancelReservationButton.setBounds(10, 120, 160, 25);
        panel.add(cancelReservationButton);

        backButton = new JButton("back");
        backButton.setBounds(10, 140, 160, 25);
        panel.add(backButton);

        backButton.addActionListener(this);
        browseButton.addActionListener(this);
        reservationButton.addActionListener(this);
        cancelReservationButton.addActionListener(this);

        frame.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            Receptionist_UI gui_receptionist = new Receptionist_UI();
            gui_receptionist.displayGUI("HARDCODE");
            frame.dispose();
        }

        else if(e.getSource() == browseButton)
        {
            Room_Controller roomController = new Room_Controller();

            JOptionPane.showMessageDialog(null, roomController.displayAvailableRooms(), "Displaying available rooms", JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getSource() == cancelReservationButton)
        {
            Reservation_Controller reservationController = new Reservation_Controller(Integer.valueOf(txbRoom.getText()));
            reservationController.cancelReservation();
        }

        else if(e.getSource() == reservationButton)
        {
            Reservation_Controller reservationController = new Reservation_Controller(Integer.valueOf(txbRoom.getText()));
            reservationController.reserveRoom();
        }
    }
}