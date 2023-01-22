// How to take input from user in Java
// Starts from here -->

/* To take input from user --> Create and object of Scanner class */
import java.util.*; /*   .*  means to import all the libraries in util class ; Scanner class is also defined in util package of Java*  ;  Putting a ; at the end is must*/

public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);     /*  Syntax to make an object of a class-->  Classname objectname = new Classname*/
    String input = sc.next(); /*  '.next()'  in sc.next will capture the input and it will be stored in input variable  
                                  '.next()'  will capture the string till a whitespace appreas. eg. 'Vanshaj Bajaj' will be stored as 'Vanshal'
                                  '.nextline()'  is used to capture the whole string including spaces*/
    System.out.println(input);
    int number = sc.nextInt(); /* '.nextInt()' is used to capture a integer input
                                    Similarly, 'nextFloat', 'nextBoolean', 'nextDouble' ,'nextLong', 'nextByte', 'nextShort' can be used. */
  }
}

/*Sum of 2 integers*/
import java.util.*;
public class JavaBasics{
  public static void main(String args[]){
      System.out.println("Enter the 1st value");
      Scanner sc = new Scanner(System.in);
      int number1 = sc.nextInt();    /* I must be capital in 'Int'*/

      System.out.println("Enter the 2nd value");
      Scanner sc = new Scanner(System.in);        /*no need to write this again*/
      int number2 = sc.nextInt();

      int sum =number1+number2;
      System.out.println(sum);
  }  
}


/*Product of 2nos*/
import java.util.*;
public class JavaBasics{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 1st value");
      float a = sc.nextFloat();   /* F must be capital in 'Float' */
      System.out.println("Enter the 2nd value");
      float b = sc.nextFloat();

      int product =a*b;
      System.out.println(product);
  }  
}


/*Area of circle*/
import java.util.*;
public class JavaBasics{
  static final float pi=3.14f;      
/* Java takes any decimal value as double by default. You must specify a decimal value as float by writing 'f' at the end of the value.
   In Java to declare any constant use the keyword 'final' */
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 1st value");
      float a = sc.nextFloat();   /* F must be capital in 'Float' */
      System.out.println("Enter the 2nd value");
      float b = sc.nextFloat();

      float product =a*b;
      System.out.println(product);
  }  
}
