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
    
/* .length()  method in Strings*/
    // paranthesis  is necessary because its a method  
    
    /* Methods of String -- 
     *compareto()
     * sorting a string
     * indexOf()
     * split()
     * join()
     * lastindexOf() with and without parameter passing
     * StringBuilder
     * */
    String stationary  ="pen,pencil,eraser,book,notebook,scale";
    String [] st =stationary.split(",");         //split method using 1 parameter // here ' , ' is deliminator 

    String [] st2 =stationary.split(",", 4);{   //split method using 2 parameters  // 4 is the limit upto which program have to split the string
    // after 4th element all others are printed as it as
      for (String  x:st2){
        System.out.println(x);
        }
    }
    
    
    
    /*StringBuilder*/
    /*To find the capacity of string builder ater increasing its capacity -->
     new capacity = max [   (old capacity + 1)*2   ,  (old no of elements+ no. of elements added now)   ]*/
     public static void main(String agrs[]){
        StringBuilder sb = new StringBuilder(); // default capacity = 16
        StringBuilder sb1 = new StringBuilder("java");  // capacity = 20

        sb.append("asfdjhgftghbvgyhgyu");
        System.out.println(sb.capacity()); 
        System.out.println("*** .capacity() method ends here ***");
   
  }
}
