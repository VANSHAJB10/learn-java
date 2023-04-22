import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}

// %s used to enter string
// -15 is for keeping a total of 15 spaces reserved to the right including the string text that will be left aligned

// %d used to enter int
// 03 is for reserving 3 spaces for integer and if the number is of 2 digits it is right aligned

// empty spaces are by default spaces in case of STRING and 0 in case of int 
// - for right reservation and + for left reservation.
