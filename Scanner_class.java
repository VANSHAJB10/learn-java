/*  1  */
Scanner sc = new Scanner(System.in);
String myString = sc.next();
int myInt = sc.nextInt();
sc.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);

/* This code creates a Scanner object named sc and uses it to read a String and an int. 
It then closes the sc object because there is no more input to read, and prints to stdout using System.out.println(String).
**** For releasing input stream reference (System.in), scanner should be closed.****       */


/*   2   */
/* input 10 numbers and then print the sum */
public void calculateSum() {
   Scanner sc=new Scanner(System.in); 
   int sum=0;
   for(int counter=1;counter<=10;counter++) 
      sum=sum+(sc.nextInt()); //no need for a one more variable
   System.out.println("The sum is: "+sum);
  sc.close();
}


/*   3   */
/*Taking different types of inputs using Scanner class*/
import java.util.Scanner;

public class Scannerinputs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Reads a String value from the user
        String str = scan.nextLine();

        //Reads a double value from the user
        double db = scan.nextDouble();

        //Reads a boolean value from the user
        boolean bool = scan.nextBoolean();

        //Reads a float value from the user
        float fl = scan.nextFloat();
    }
}
