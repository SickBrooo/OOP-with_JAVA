
package GUI;

import javax.swing.*;
import java.awt.*;

public class Try {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Hello");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        JLabel name =new JLabel("Name");
        JTextField nameTF=new JTextField(20);
        JButton login=new JButton("Login");
        p.add(name);
        p.add(nameTF);
        p.add(login);
        frame.setContentPane(p);
        frame.setVisible(true);
    }
}
