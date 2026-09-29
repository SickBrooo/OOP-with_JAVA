package Trying_JoptionPane.Currency_convertor;
import javax.swing.*;
public class Q13 {
    public static void main(String[] args) {
        String x=JOptionPane.showInputDialog(null,
                "Enter 0 to Convert BDT to USD:"+"\n"+"Enter 1 to Convert USD to BDT: ",
                "Convertor",
                JOptionPane.PLAIN_MESSAGE);
        int y=Integer.parseInt(x);
        String amnt=JOptionPane.showInputDialog(null,
                "Enter Amount: ",
                "Place amount",
                JOptionPane.PLAIN_MESSAGE);
        int amount=Integer.parseInt(amnt);
        double total=0;
        if(y==0)
        {
            total=amount/120.0;
            JOptionPane.showMessageDialog(null,
                    "Converted Amount: "+total+"$",
                    "Thanks Me Later!!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if(y==1) total=amount*120;
        JOptionPane.showMessageDialog(null,
                "Converted Amount: "+total+"taka",
                "Thanks Me Later!!",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
