/*ALL constants are defined in UPPERCASE*/  

JPanel p = new JPanel();
p.setLayout(new GridLayout(0, 0));
p.add(new JButton("1"));
p.add(new JButton("2"));

// Runtime error 
// as in ***   p.setLayout(new GridLayout(int 1 , int 2)); *** -->  0 as an input is considered as a variable and the int value is taken to be a constant.


/*Tic Tac Toe*/
Panel will be havng grid layout of 3 x 3 


/* Font is a helper class */
Font(String name , int style, int size)

there are constants defined for font style
0 --> FONT.PLAN
1 --> FONT.BOLD
2 --> FONT.ITALIC
3 --> BOLD + ITALIC

/* Timer concept */
timer.setText(""+h + " : " + m + " : " + s); 
//  **** WOW!!! **** setText method take as string parameter so a empty "" is concatenated before hours 

// *** Thread ***
/* To make multiple codes to run PARALLELY --> Thread is used
 here we want the the timer to keep running while the game is being played parallely
 Thread is in --> java.lang package */

Thread.sleep(1000); 
        // takes time in milli second
        // sleep method is static method
        // sleep method throws Interrupted exception 
