package SimpleCalculator;

import LeapYear.Year;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {


    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JTextField tfResult;
    private JButton btnCompute;
    private javax.swing.JPanel JPanel;

    public Calculator() {
        btnCompute.addActionListener(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());

            if(cbOperations.getSelectedIndex() == 0){
                int sum = num1 + num1;
                tfResult.setText(String.valueOf(sum));
            }
            if(cbOperations.getSelectedIndex() == 1){
                int dif = num1 - num2;
                tfResult.setText(String.valueOf(dif));
            }
            if(cbOperations.getSelectedIndex() == 2){
                int prod = num1 * num2;
                tfResult.setText(String.valueOf(prod));
            }
            if(cbOperations.getSelectedIndex() == 3){
                int quo = num1 / num2;
                tfResult.setText(String.valueOf(quo));
            }

        });
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.JPanel);
        app.setSize(500,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
