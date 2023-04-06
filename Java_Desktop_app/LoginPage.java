import java.awt.event.*;
import javax.swing.*;

class LoginPage{
  public static void main(String args[]){
    JFrame f = new JFrame("Login");
    f.setSize(600,500);


    f.setLayout(new GrdLayout(2,2,50,30));   // (rows, columns, horizontal gap , vertical gap) 50,30 --> horizontal, vertical gap   (gap is the padding betwwen components nt between component and border) 
    

    JTextField t1 = new JTextFiled(20);
    JPasswordField p1 = new JPasswordField(20);
    JButton b1 = new JButton("");
    JButton b1 = new JButton("");

    // Local Listner class --> defned inside any other block (loop, method, constructor OR class)
    class MyListner implements ActionListner
    {
      public void actionPerformed(ActionEvent ev){
        if ()ev.getSource() == b1){
           JOption
        }
      }
    }


  }

}
