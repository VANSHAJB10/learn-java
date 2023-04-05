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
/* sleep(long,int)  --> if for a particular time in int the code is not getting executed then it will automatically wake up*/
        // takes time in milli second
        // sleep method is static method
        // sleep method throws Interrupted exception
// there is no alternative for thread.sleep() ... we have to handle the exception  


/*Events*/
/* Present in java.awt.event package;
 Every _________ has a event associated wth it 
 corresponding to every event there is a predefined listner Interface

Action Events: buttons, menuItems
KeyEvents:                                                              --> KeyListener
MouseEvent: Any click with the mouse , Scroll                           --> MouseListener
FocusEvent: when u click on a field the already written text disappers  --> FocusListener
WindowEvent: provides 7 functionalities window open , window close, window activated, window iconified, window deiconified, window closing . But this is rarely used.


to implement events make a class that implements its listner
*/
