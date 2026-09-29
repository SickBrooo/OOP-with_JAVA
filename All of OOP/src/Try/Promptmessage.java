package Try;

import javax.swing.*;

public class Promptmessage {
    public static void main(String[] args)
    {
     String Name=JOptionPane.showInputDialog(null,"Enter Your Name: ","Name",JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Your Name is "+Name,"Message",JOptionPane.INFORMATION_MESSAGE);

    }

}
