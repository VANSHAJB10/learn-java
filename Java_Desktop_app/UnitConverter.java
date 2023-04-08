/*With CardLayout*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutTest {
    public static void main(String[] rk) {
        JFrame f = new JFrame();
        f.setSize(600, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);

        String [] arr ={"Red","Green","Yellow","Cyan","Magenta"};
        JComboBox <String> jcb = new JComboBox<>(arr);
        f. add (jcb ,BorderLayout.NORTH);

        JPanel mainpanel = new JPanel();
        CardLayout cl = new CardLayout(); // card layout object
        mainpanel.setLayout(cl);          // setting the main panel
        f.add(mainpanel);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        mainpanel.add(p1,"RED"); // adding panel 1 with name RED in the man panel

        // in card layout to add any panel assign a name whch is a string
/* IMPORTANT! */
        // by default the first card which s added in mainpanel will be displayed
        // if u have border layout the last added component will be visible
        // if u have card layout the first added component will be visible

        JPanel p2 = new JPanel();
        p1.setBackground(Color.red);
        mainpanel.add(p2,"MAGENTA");

        JPanel p3 = new JPanel();
        p1.setBackground(Color.green);
        mainpanel.add(p3,"GREEN");

        JPanel p4 = new JPanel();
        p1.setBackground(Color.red);
        mainpanel.add(p4,"YELLOW");

        JPanel p5 = new JPanel();
        p1.setBackground(Color.red);
        mainpanel.add(p5,"CYAN");
        
    //To create 100s of cards use loop
/* for multiple combobox -- getsource is used */
        class MyListener implements ItemListener{
            public void itemStateChanged(ItemEvent e){
                String item = (String)jcb.getSelectedItem();
                cl.show(mainpanel,item.toUpperCase());     // string reads in upper case
            }
        }

        MyListener ml=new MyListener();
        jcb.addItemListener (ml);
    }


}    
