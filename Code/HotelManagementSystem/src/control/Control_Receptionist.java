package control;

// Receptionist has Control_Guest 

import entity.User;

import javax.swing.JOptionPane;

// a Receptionist has unique Control_Receptionist
public class Control_Receptionist {

    public Control_Receptionist(User newUser)
    {
        JOptionPane.showMessageDialog(null, "Receptionist : " + newUser.getUsername(), null, 1);
    }

    private void issueInvoice()
    {
        JOptionPane.showMessageDialog(null, "Receptionist & Manager: Issue Invoice", null, 1);
    }
}
