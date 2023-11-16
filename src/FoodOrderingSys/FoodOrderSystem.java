package FoodOrderingSys;

import LeapYear.Year;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderSystem extends JFrame {

    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    private javax.swing.JPanel JPanel;
    public FoodOrderSystem() {
        btnOrder.addActionListener(e -> {
            double sum = 0;
            if(cPizza.isSelected()){
                sum += 100;
            }
            if(cBurger.isSelected()){
                sum += 80;
            }
            if(cFries.isSelected()){
                sum += 65;
            }
            if(cSoftDrinks.isSelected()){
                sum += 55;
            }
            if(cTea.isSelected()){
                sum += 50;
            }
            if(cSundae.isSelected()){
                sum += 40;
            }

            float price = (float) sum;
            if(rb5.isSelected()){
                price = (float) (sum - (sum *0.05));
            }
            if(rb10.isSelected()){
                price = (float) (sum - (sum *0.10));
            }
            if(rb15.isSelected()){
                price = (float) (sum - (sum *0.15));
            }

            JOptionPane.showMessageDialog(this,"The total price is Php " + String.format("%.2f",price));
        });
    }

    public static void main(String[] args) {

        FoodOrderSystem app = new FoodOrderSystem();
        app.setContentPane(app.JPanel);
        app.setSize(500,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
