/*Consider Aman is visiting Nehru Zoo. She has seen there are N elephants standing in a row. 
She wants to remove the elephants having the same height standing in consecutive.Write a program for Aman so that she can get the desired sequence of elephants.

Input Format;
The first line will be containing one Integer representing a number of elephants N.
The second line will contain N integers representing the heights of the elephants.

Constraints:
N>2 && N<30

Output Format:
The desired sequence of elephants after removing elephants having the same height standing in consecutive.*/

import java.util.*;
public class hackerrank {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int elephants[]= new int[n];
        if(n>2 && n<30){
            for(int i=0;i<n;i++){
                elephants[i]=sc.nextInt();
            }
            for(int i=1;i<n;i++){
                if(elephants[i-1]!=elephants[i])
                System.out.print(elephants[i-1]+" ");
            }
            System.out.print(elephants[n-1]);
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
