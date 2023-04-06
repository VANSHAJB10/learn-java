/*
Local and anonymous classes are non static 
*/

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

// Listner --> defined in java.awt.event package;
* ItemEvent : when a menu provide different ptions to choose one from them  (radio button, dropdown menu, etc)
* Action Events: buttons, menuItems                                       --> Action Listener
* KeyEvents:  When typng through keys of keyboard                         --> KeyListener
* MouseEvent: Any movement of mouse (motion not clcks)                    --> MouseListener, MouseMotion Listner
* FocusEvent: when u click on a field the already written text disappers  --> FocusListener
* WindowEvent: provides 7 functionalities window open , window close, window activated, window iconified, window deiconified, window closing . But this is rarely used.


*
to implement events make a class that implements its listner

example --
class MyClass implements ActionListenr
{
 
   }

* If a button is registered with a Listner then only the Listner class will respond
syntax  -- add XXX Listner (object of Listner class)
example -- t1.add KeyListner(ob);


* 
/* ATTENTION */ 
*  Multiple classes for multiple can be created and also
   Single Listner class can be used to implement multiple Event Listners. (as multiple Interfaces can be implemented)

*/

**
QUESTION -- Which is a lightweght process?
JDialogue, JFrame inherts 
JPanel and Any subclass of JPanel is lightweight process .
