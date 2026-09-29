package Trying_JoptionPane.Question13;
import javax.swing.JOptionPane;
public class Question13 {
    public static void main(String[] args) {
       String val= JOptionPane.showInputDialog(null,
                "Enter '0' to Convert USD$ to BDT: "+"\n"+"Enter 1 to Convert BDT to USD$:",
                "Convert Currency",
                JOptionPane.QUESTION_MESSAGE);
       String amnt=JOptionPane.showInputDialog(null,
               "Enter Amount:",
               "Amount",JOptionPane.PLAIN_MESSAGE);
       int value=Integer.parseInt(val);
       int amount=Integer.parseInt(amnt);
        double x;
        double y;

       if(value==0)
       {
          x= amount*120;
          JOptionPane.showMessageDialog(null,
                  "Coverted Amount:"+x+"Taka",
                  "Here You go",JOptionPane.PLAIN_MESSAGE);
       }
       else if(value==1){
           y=amount/120.0;
           JOptionPane.showMessageDialog(null,
                   "Converted Amount:"+y+"$",
                   "Here you go!",JOptionPane.PLAIN_MESSAGE);
       }

    }
}
