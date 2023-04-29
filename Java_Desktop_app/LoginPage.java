import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class LoginPage{
  public static void main(String args[]){
    JFrame f = new JFrame("Login");
    f.setSize(600,500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setLayout(new GrdLayout(2,2,50,30));   // (rows, columns, horizontal gap , vertical gap) 50,30 --> horizontal, vertical gap   (gap is the padding betwwen components nt between component and border) 
    

    JTextField t1 = new JTextFiled(20);
    JPasswordField p1 = new JPasswordField(20);
    JButton b1 = new JButton("");
    JButton b1 = new JButton("");

    // Local Listner class --> defned inside any other block (loop, method, constructor OR class)
    class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
          if(ev.getSource() == b1)
            {
                JOptionPane.showMessageDialog(f, "Hello "+t1.getText());
            }
            else if(ev.getActionCommand().equals("Clear"))
            {
                t1.setText(null);
                p1.setText(null);
            }
       }
    }

    MyListener ml = new MyListener();
    b1.addActionListener(ml);
    b2.addActionListener(ml);

     //Object getSource()
      f.add(t1);
      f.add(p1);
      f.add(b1);
      f.add(b2);

        f.setVisible(true);
  }
}





// Password box
import javax.swing.*;    
public class PasswordFieldExample {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Password Field Example");    
     JPasswordField value = new JPasswordField();   
     JLabel l1=new JLabel("Password:");      // displays entered password with dots
        l1.setBounds(20,100, 80,30);    
         value.setBounds(100,100,100,30);    
            f.add(value);  f.add(l1);  
            f.setSize(300,300);    
            f.setLayout(null);    
            f.setVisible(true);     
}  
}  
