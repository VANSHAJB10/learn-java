// To find if a number is perfect square
import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPerfectSquare(int x)
    {
        if (x >1 && x<1000 ) // && is called short circuit AND operator. --> 
//                              it means The second operand is not evaluated if the result can be deduced solely by evaluating the first operand.
// However & can also be used instead of && in this.
        {         
            int sr = (int)Math.sqrt(x); 
            return ((sr * sr) == x);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (isPerfectSquare(n))
            System.out.print("Perfect Square");
        else
            System.out.print("Not Perfect Square");
    }
}
