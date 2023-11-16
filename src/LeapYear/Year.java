package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Year extends JFrame {
    private JTextField tfYear;
    private JButton btnCheckYear;
    private javax.swing.JPanel JPanel;


    public Year() {
    btnCheckYear.addActionListener(e -> {
        int year = Integer.parseInt(tfYear.getText());

        if(year % 4 == 0){
            JOptionPane.showMessageDialog(this,"Leap year");
        }else {
            JOptionPane.showMessageDialog(this,"Not a leap year");
        }

    });
}

    public static void main(String[] args) {
        Year app = new Year();
        app.setContentPane(app.JPanel);
        app.setSize(500,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
