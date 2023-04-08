import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UnitConverter
{
     public static void main(String [] rk)
     {
	JFrame jf = new JFrame();
	jf.setSize(600, 400);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	String [] arr = {"Temperature", "Weight", "Length", "Currency"}; // string for conversion types

	JComboBox <String>  jcb = new JComboBox<>(arr);
	jcb.insertItemAt("Time", 1);	

	

	jf.add(jcb, BorderLayout.NORTH);

	JPanel p = new JPanel();
	jf.add(p);
	p.setLayout(null);
	
	String [] temp = {"Celcius", "Fahrenheite", "Kelvin"};
	JTextField t1 = new JTextField(10);
	JComboBox <String> jc1 = new JComboBox<>(temp);

	JTextField t2 = new JTextField(10);
	t2.setEditable(false);   
	JComboBox <String> jc2 = new JComboBox<>(temp);

	p.add(t1);     t1.setBounds(100, 100, 200, 50);
	p.add(jc1);   jc1.setBounds(350, 100, 80, 50);

	p.add(t2);     t2.setBounds(100, 200, 200, 50);
	p.add(jc2);   jc2.setBounds(350, 200, 80, 50);

	class MyListener implements ItemListener
	{
	     public void itemStateChanged(ItemEvent e)
	      {
              }
	}	
	MyListener ml = new MyListener();
	jcb.addItemListener(ml);
	jc1.addItemListener(ml);
	jc2.addItemListener(ml);
	
	jf.setVisible(true); 
      }
}
