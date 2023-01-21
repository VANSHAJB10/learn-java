//To find whether a number is Prime or Not.

/*Method 1*/
import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number= sc.nextInt();
        
        if(isPrime(number)) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}


/*Method 2*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++) {
            if(n%i == 0) {
                System.out.println("Not Prime Number");
                System.exit(0);
            }
        }
        System.out.println("Prime Number");
        sc.close();
    }
}
