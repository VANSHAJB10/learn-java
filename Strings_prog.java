import java.util.*;
public class Strings_prog{
  public static void main (String []args){

/*two ways of string declaration*/
    String str="java programming";
    String str2 = new String("abcd");


/* == in strings */

String s1 = "Tony";
String s2 = "Tony";                       /* s2 and s1 points to same memory block. --> there is only one string and both s1 and s2 are pointing to that */
String s3 = new String ("Tony");          /* This creates a new string in the memory and s3 points to that new string */

if (s1 == s2){
  System.out.println("Equal strings");
  }
else{
  System.out.println("UnEqual Strings");
  }                                        /*True: because there is only one string and both s1 and s2 are pointing to that*/


if (s1 == s3){                             /*  False : because s1 and s3 are pointing to two different strings in memory*/
  System.out.println("Equal strings");
  }
else{
  System.out.println("UnEqual Strings");
  }





    
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
