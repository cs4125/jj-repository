package control;

import boundary.Login_UI;

import javax.swing.*;

/**
 * Created by Ross on 04/04/2015.
 */
public class Main
{
    // main method
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "jim 123 = Manager"
                + "\npat 456 = Receptionist"
                + "\njoe 789 = Guest", null, 1);

        Login_UI loginBox = new Login_UI();
        loginBox.displayGUI();

    }
}
