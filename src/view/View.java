package view;

import javax.swing.*;
import java.util.ArrayList;

public class View {
    public String showInputDialog(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public int showMenu() {
        String[] options = {"1-Add person with phone " , "2-Delete person", "3-Show list", "4-Exit program"};
        return JOptionPane.showOptionDialog(null, "Select an option:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    }

    public void showList(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String person : list) {
            sb.append(person).append("\n");
        }
        showMessage(sb.toString());
    }
}
