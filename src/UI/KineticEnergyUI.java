package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KineticEnergyUI {

    JFrame frame = new JFrame("Window");
    JButton energy = new JButton("PHYSICS WORKS");
//    JButton energy2 = new JButton("PHYSICS WORKS");

    JLabel text = new JLabel("GET READY TO CALCULATE");
    JTextField textField = new JTextField();

    public void mainUI() {
        frame.setSize(250, 400);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);

        frame.add(energy);

        frame.add(text);
        frame.add(textField);

        energy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI2();

            }
        });
    }

    public void mainUI2() {
        JFrame frame2 = new JFrame("Window");

        JLabel text2 = new JLabel("  ENTER mass:");
        JLabel text3 = new JLabel("  ENTER velocity:");
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JButton calculate = new JButton("calculate");


        frame2.setSize(150, 200);
        frame2.setLayout(new GridLayout(3, 1));
        frame2.setVisible(true);


        frame2.add(text2);
        frame2.add(textField2);
        frame2.add(text3);
        frame2.add(textField3);
        frame2.add(calculate);


        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KineticEnergy myobj = new KineticEnergy();
                float answer = myobj.calculatekineticEnergy(Float.parseFloat(textField2.getText()), Float.parseFloat(textField3.getText()));
                JOptionPane.showMessageDialog(null, answer);
            }


        });

    }

        }








