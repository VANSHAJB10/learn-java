import java.awt.*;


JFrame f= new JFrame("Puzzle game")//Frame can be created without any parameter
Jpanel centre = new JPanel();

//Panel to hold 9 button at centre of frame
JPanel centre = new JPanel();
centre.setLayout(new GridLayout(3,3));

for(){

}
f.add(center);

/* 'Timer' on the top and name of player OR ' Date and Time at the bottom ' are labels*/ 

JLabel date = new JLabel("Date and time",JLabel.CENTER); // to dsplay the date and time in the centre --> JLabel.CENTRE is used
JLabel date = new JLabel("Timer");    // to dsplay the timer in the centre --> JLabel.CENTRE is used
// *******    DEFAULT VALUE of their allignment is 'Left'    ********


f.add(timer, BorderLayout.NORTH);     /*  to display timer at the top  -->  BorderLayout.NORTH  */
f.add(date, BorderLayout,SOUTH);

//properties of frame
f.setSize(600,600);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVsible(true);
