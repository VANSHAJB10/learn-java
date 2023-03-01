import java.util.*;
public class Strings_prog{
  public static void main (String []args){
    /*two ways of string declaration*/
    String str="java programming";
    String str2 = new String("abcd");
    
    /*Strings are immutable*/
    
    Scanner sc = new Scanner(System.in);
    String name = sc.next();   // takes only 1st word
    String name = sc.nextLine();   // takes full sentence (all characters)
    
    System.out.println(name);
    /* */
   
  }
}
