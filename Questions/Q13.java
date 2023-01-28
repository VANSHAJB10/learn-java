/*Liz built up a software code taking number of 3 different color blocks as input. 
Considering the end users can enter floating point numbers too as at least 1 block of a color is broken. Design the code converting the not-full numbers to full numbers.

Input Format
Number of balls for three different colors.

Constraints
3 inputs separated with space can be floating points or integers.

Output Format
3 integer numbers
*/

/*Code1*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        float b =sc.nextFloat();
        float c =sc.nextFloat();
        if(a==(int)a){
            System.out.print((int)a); 
            System.out.print(" "); 
        }
        else if(a==(float)a){ 
            System.out.print((int)a+1);
            System.out.print(" "); 
        }
        if(b==(int)b){
            System.out.print((int)b);
            System.out.print(" "); 
        }
        else if(b==(float)b){
            System.out.print((int)b+1);
            System.out.print(" "); 
        }
        if(c==(int)c){
            System.out.print((int)c);  
            System.out.print(" "); 
        }
        else if(c==(float)c){
            System.out.print((int)c+1);
            System.out.print(" "); 
        }
        
    }
}

/*Code2*/  /* Not sure if its correct !*/
import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in); /*Taking input from user*/ 
      
        double d = s.nextDouble() , e=s.nextDouble(), f=s.nextDouble();
        System.out.println( (int)Math.ceil(d) + " " + (int)Math.ceil(e) + " " +(int)Math.ceil(f));
    }
}
