package GUI.Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Final_assignment {
    public static void main(String[] args) {
        try
        {
            File f1=new File("src/Assignment");
            FileWriter fw=new FileWriter(f1,true);
            FileReader fr=new FileReader(f1);
            BufferedWriter bw=new BufferedWriter(fw);
            BufferedReader br=new BufferedReader(fr);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        JFrame f1=new JFrame();
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel N1,N2,Result;
        JTextField Input1,Input2,Output;
        JButton Add,Subtract;

        N1=new JLabel("N1");
        f1.add(N1);
        Input1=new JTextField();
        Input1.setPreferredSize(new Dimension(80,30));
        f1.add(Input1);

        N2=new JLabel("N2");
        f1.add(N2);
        Input2=new JTextField();
        Input2.setPreferredSize(new Dimension(80,30));
        f1.add(Input2);

        Result=new JLabel("Result");
        f1.add(Result);
        Output=new JTextField();
        Output.setPreferredSize(new Dimension(80,30));
        f1.add(Output);

        Add=new JButton("Add");
        f1.add(Add);
        Subtract=new JButton("Subtract");
        f1.add(Subtract);

        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum=0;
               int a=Integer.parseInt(Input1.getText());
               int b=Integer.parseInt(Input2.getText());
               sum=a+b;
               Output.setText(String.valueOf(sum));
            }
        });
        Subtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                double a=Double.parseDouble(Input1.getText());
                double b=Double.parseDouble(Input2.getText());
                double sub=a-b;
                Output.setText(""+sub);
            }
        });


        f1.setVisible(true);
    }
}
