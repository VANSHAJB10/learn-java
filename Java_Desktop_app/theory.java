Local and anonymous classes are non static 

* ALL constants are defined in UPPERCASE *



/* Concept */
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
 **** WOW!!! ****  setText method take as string parameter so a empty "" is concatenated before hours 



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
* KeyEvents:  When typng through keys of keyboard       3 methods                  --> KeyListener
* MouseEvent: Any movement of mouse (motion not clcks)  5 methods                 --> MouseListener, MouseMotion Listner
* FocusEvent: when u click on a field the already written text disappers    2 methods        --> FocusListener
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


*** FocusListner ***  -- 
* it is an Interface
* it has 2 methods-->focusLost , focusGained
* these methods are automatically fired by JVM -- it automatically identify, and call the method



* 
/* ATTENTION */ 
*  Multiple classes for multiple can be created and also
   Single Listner class can be used to implement multiple Event Listners. (as multiple Interfaces can be implemented)

*/

**
QUESTION -- Which is a lightweght process?
JDialogue, JFrame inherts 
JPanel and Any subclass of JPanel is lightweight process .




/* Login form */
* if u dont want ot display dots in password but *    -->    p1.setEchoChar('*');
* 


/* Unit convertor */
// * JcheckBox --> multiple selection

// * for single selection -->
// JComboBox 
// JRaduoButton


import java.swing.*;

class unit_concerter{
public static void main(String[] args) {
    JFrame jf= new JFrame();
    jf.setSize(600,400);
    jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String []arr ={"Temp", "weight","Length","Currency"};
    JComboBox <String> jcb = new JComboBox <String> (arr); 
    // type of combobox (  <String>  ) is added  for 2 reasons -
     /* 1.in non genric combobox the items of other types can be added too which can cause problem */
    /* 2.output will be string type instead of object type */

    // dynamic addition of items is also possible 
    // by default the items are added at the end but can be added at any particular position as well.

    /* <> is called Type inference diamond */
    jcb.addItem("Time"); // time will be added at the end but to add it at a particular position, its index needs to be passed as well

}



/* Adapter Class */
It is a subclass of Listener Interface

Corresponding to every listener interface a class is created -->  ADAPTER CLASS
It is predefined not automatically created.
It is provided for only for interface which have more than 1 abstract method.

NO Adapter class for :
item 
action

Adapter class exist for only :
MouseAdapter
KeyAdapter
WindowAdapter
FocusAdapter


It provides blank implementaton to all  abstract method of Listener interfaces 
Benefits -- You need to overwrite only those method which u want to use ... 🙂
     Example -- no need NOT to impelemt 6 out 7 methods of Window Listener when you want to use just 1 method of it.

Syntax -- 
class KeyAdapter implements KeyListener{

}


* * * * * * * * *  in implementation of CLOCK with 3 option -- time , stopwatch, worldclock  * * * * * * * * *
the concept of Tabbed pane is used.  

/* Important!!*/
MouseListener, MouseMoton Listener, ' MouseWheel Listener ' are implement by MouseAdapter class
'Other wise MouseWheel Listner do not rqure any Adapter class but it is included in MouseAdapter Class'
MouseMotion Listener also exists

 
 
 



/*  MouseMoton Listener*/
It has 2 methods --> 
* mouseMoved()
* mouseDragged()


/* KeyListener */
It has 3 methods --> 
* keyPressed()
* keyReleased()
* keyTyped()

 
 
 To create a checkbox that is selected by default in Java Swing --> 
 JCheckBox checkbox = new JCheckBox("My Checkbox", true);
 
 
 
 
 
/*Creating a Connection object in Java Swing involves establishing a connection to a database using a database driver and a connection URL. 
To create a Connection object:*/
 
 
import java.sql.*;

Connection conn = null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost/mydatabase";
    String username = "root";
    String password = "mypassword";
    conn = DriverManager.getConnection(url, username, password);
    // do something with the connection
} catch (ClassNotFoundException ex) {
    // handle class not found exception
} catch (SQLException ex) {
    // handle SQL exception
} finally {
    try {
        if (conn != null) {
            conn.close();
        }
    } catch (SQLException ex) {
        // handle SQL exception
    }
}

