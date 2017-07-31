package PrimeNumber;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daniel_D'AGE on 25.07.2017.
 */
public class FrameTextField implements ActionListener{
    JTextArea text;

    public static void main(String[] args) {
        FrameTextField gui =  new FrameTextField();
        gui.makeGUI();

    }

    private void makeGUI() {
        JTextField numberFromUser;
        JTextField result;
        JFrame frame = new JFrame("Liczby pierwsze");
        frame.setSize(450, 400);
        frame.setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton button = new JButton("Sprawdź!");
        button.setBounds(50,50,100,30);
        button.setBackground(Color.lightGray);
        frame.add(button);


        numberFromUser = new JTextField();
        numberFromUser.setBounds(50, 100, 100, 30);
        frame.add(numberFromUser);

        result = new JTextField();
        result.setBounds(50, 200, 100, 30);
        result.setEditable(false);
        frame.add(result);

        button.addActionListener(event -> {
            int numberUser = Integer.valueOf(numberFromUser.getText());


           //numberFromUser(); metoda, która przyjmuje inta zwraca booleana i sprawdza czy liczb ma wartośc pierwszą
           //result.setText(numberFromUser());
        });

        JPanel panel = new JPanel();
        panel.setBounds(20, 40, 100, 50);
        frame.add(panel);

        button.addActionListener(this);
        JTextArea text = new JTextArea(5,5);
        text.setLineWrap(true);

        frame.getContentPane().add(BorderLayout.NORTH,panel);
        frame.getContentPane().add(BorderLayout.CENTER,text);
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        frame.setSize(300,300);
        frame.setVisible(true);
        text.setSize(150,150);
        text.setVisible(true);
        button.setSize(30,20);
        button.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
