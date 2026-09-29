package GUI.ButtonWorrks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public static void main(String[] args) {
        JFrame f1=new JFrame("Buttons");
        f1.setSize(300,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("OK");
        f1.add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("I am OK ");
            }
        });
        f1.setVisible(true);

    }
}
