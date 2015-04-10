package boundary;

import control.Control_Reservation;
import control.Control_Room;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Reservation extends JFrame implements ActionListener {
    private JButton backButton;
    private JFrame frame;
    private JButton browseButton;
    private JButton reservationButton;
    private static JTextField txbRoom;

    // needs to load a Control object with selection
    public GUI_Reservation()
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

        reservationButton = new JButton("Reserve Room");
        reservationButton.setBounds(10, 100, 160, 25);
        panel.add(reservationButton);

        txbRoom = new JTextField(6);
        txbRoom.setBounds(100, 10, 160, 25);
        panel.add(txbRoom);

        backButton = new JButton("back");
        backButton.setBounds(10, 120, 160, 25);
        panel.add(backButton);

        backButton.addActionListener(this);
        browseButton.addActionListener(this);
        reservationButton.addActionListener(this);

        frame.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            GUI_Guest gui_guest = new GUI_Guest();
            gui_guest.displayGUI("HARDCODE");
            frame.dispose();
        }

        else if(e.getSource() == browseButton)
        {
            Control_Room control_room = new Control_Room();

            JOptionPane.showMessageDialog(null, control_room.displayAvailableRooms(), "Displaying available rooms", JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getSource() == reservationButton)
        {
            Control_Reservation control_reservation = new Control_Reservation(Integer.valueOf(txbRoom.getText()));
            control_reservation.reserveRoom();
            frame.dispose();
        }
    }
}