import java.awt.*;


JFrame f= new JFrame("Puzzle game")//Frame can be created without any parameter
Jpanel centre = new JPanel();

//Panel to hold 9 button at centre of frame
JPanel centre = new JPanel();
centre.setLayout(new GridLayout(3,3));



//properties of frame
f.setSize(600,600);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVsible(true);
