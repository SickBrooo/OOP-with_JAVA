package Trying_JoptionPane;
import javax.swing.JOptionPane;
public class Try1st {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null,"I am UseLess","Adel",JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null,"I am UseLess","Adel",JOptionPane.INFORMATION_MESSAGE);
      // JOptionPane.showMessageDialog(null,"I am UseLess ?","Adel",JOptionPane.QUESTION_MESSAGE);
//        while(true){
//             JOptionPane.showMessageDialog(null,"Your Computer Has a Virus! Scan!","Warning",JOptionPane.WARNING_MESSAGE);
//        }

       // JOptionPane.showMessageDialog(null,"Virus Detected, Shutdown!","WARNING!",JOptionPane.ERROR_MESSAGE);
       // System.out.println(JOptionPane.showConfirmDialog(null,"Bro,Do you even Code!!","Important Message",JOptionPane.YES_NO_CANCEL_OPTION));
        // or I can just Store the Output in a variable and Do Next Tasks;
      // String Name= JOptionPane.showInputDialog(null,"What is Your Name? ");
       //JOptionPane.showMessageDialog(null,"Your Name is "+Name,"Name",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showOptionDialog(null,
                "Just Trying",
                "Option Try",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                0 );



    }

}
