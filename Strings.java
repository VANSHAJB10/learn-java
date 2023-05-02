import java.util.*;
public class Strings_prog{
  public static void main (String []args){

/* two ways of string declaration */
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


// To chack if wo strings are equal --> use .equals() method. 

/* .equals() method  */                                     //It returns a boolean type value
if ( String s1.equals(s3) ) {
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

/* .split() method */    
    
    String stationary  ="pen,pencil,eraser,book,notebook,scale";
    String [] st =stationary.split(",");         //split method using 1 parameter // here ' , ' is deliminator 

    String [] st2 =stationary.split(",", 4);{   //split method using 2 parameters  // 4 is the limit upto which program have to split the string
    // after 4th element all others are printed as it as
      for (String  x:st2){
        System.out.println(x);
        }
    }
    
    
    
/* .compareTo()  method */
  // used to comapre the strings Lexographically (alphabetical order)
 
str.compareTo(str2);     /*   
                            output        --           meaning
                              = 0         --      string 1 = string 2
                              > 0         --      string 1 > string 2
                              < 0         --      string 1 < string 2
                         */

/* compareToIgnoreCase() */
.compareToIgnoreCase()    --> it ignores uppercase or lowercase 
    
//code-->
// to print largest string in an array
String [] fruits ={"banana","mango", "apple", "kiwi"};
Stirng largest = fruits[0];      // initializing the first element of array as the largest value beforehand.
    
for (int i = 0; i < fruits.length(); i++){
  if( largest.compareToIgnoreLowerCase(fruits[i]) < 0){
    largest = fruits[i];
  }
System.out.println{largest};  
}

//      * ANALYSIS *
/* Time complexity of .comapreTo()  will be   ""  O(x*n)  ""
    if x is length of largest string an dn is number of strings in the array                      */


    
    
// Java String are IMMUTABLE
/*

*Interning* -  When a reference variable points to a String (in the intern pool (OR String pool) ) and a new reference variable is declared with exactly same value of String then 
                this new reference variable points to the same String as the first refernece variable is pointing.
               No new String of the same value is created. This is called interning. 
               
               Example -
                String s1 = "Tony";
                String s2 = "Tony";     
                here, both s1 and s2 are storing the address of the same object i.e. Tony.
                
But in case of --  ' String s3 = new String ("Tony"); '
A new Object 'Tony' is created instead of Interning. And s3 stores a different object address than s2 & s1. 
               
*/
    
// Cons of String Immutability -->
/*    
    Algorithm -- 
      Stirng str = "Tony";
      for (char a to z){
        str += char;
      }
    
    * ANALYSIS *
    first str points to 'Tony'
    as soon as the lloop starts -- 
      Tony is copied and 'a' is added at its end making it 'Tonya'
        then 'Toya' is copied and 'b' is added at its end making it 'Tonyab'
          then 'Toyb' is copied and 'c' is added at its end making it 'Tonyabc'
                                                                        and so on ...
                                                                      
--> each time copying the string of length 'm'  and repeating the process 'n' times (here n= 26)    --> make the Time Complexity = O(n*m) ~=  O(n*n) which is quadratic hence slow.
      





/* .toString() */
  // converts any Object to String.    
  /*  Only Objects are converted to String 
          Example - int a = 10;
                    a.toString();   --> will not cnvert it to string , Rather
                    
                   Integer a = 10; ;
                   a.toString();   --> willbe converted it to string as it is an object of Integer class 
  */



    
    

*/    
    /*StringBuilder*/
  // Strings of this type can be modified.  It overcomes the quadratic time complexity problem of Strings.
     
        StringBuilder sb = new StringBuilder(); // default capacity = 16 
        StringBuilder sb1 = new StringBuilder("java");  // capacity = 20
  
/* .append() */ 
// This method is used to add characters at the end of a string
    
    /*To find the capacity of string builder ater increasing its capacity -->
     new capacity = max [   (old capacity + 1)*2   ,  (old no of elements+ no. of elements added now)   ]*/
    
        sb.append("asfdjhgftghbvgyhgyu");
        System.out.println(sb.capacity()); 
        System.out.println("*** .capacity() method ends here ***");
    
    
    
   
  
}
