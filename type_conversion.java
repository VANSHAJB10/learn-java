/* Type Conversion  OR  Widening Conversion  OR  Implicit Conversion*/

/* Conditions for Type conversion:
A ---> Both must be compatible
B ---> Destination type > Source type 

byte --> short --> int --> float --> long --> double
*/


import java.util.*; // ; is must
public class Type_Conversion{
  public static void main(Strings args[]){
    int a= 25;
    long b=a;
    
    long d=24;
    int c=d;
    
    System.out.println(b);   // Will print value of b // This conversion is allowed
    System.out.println(c);   //Lossy conversion    // Not allowed   // will give error
    /* Lossy Conversion - A conversion in which data may be lost! */
  }
}


import java.util.*;
public class Type_Conversion
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    float a = sc.nextInt(); // Allowed
    int a = sc.nextFloat(); // Not Allowed  //Will give error
    System.out.println(a);
    }
}
