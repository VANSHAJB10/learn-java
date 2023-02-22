/* In a sports event, Lindsey, a famous athlete, has decided to meet her fans and shake hands with them. 
The order in which she will meet them is the fan degree. i.e. the fan with maximum degree will be considered first. 
Now, the fans are required to take positions according to the degree value. 
While they are not allowed to swap positions with any other person, but with the person at their adjacent places. 
Write a program to implement the same using method where sorting logic should be written in method.

Input Format:
4 8 5 9 6 7 1 2 10 3

Constraints:
Consider that there are 10 persons participating in the sports event and their fan degrees are in integer numbers (between 1 to 10).

Output Format:
10 9 8 7 6 5 4 3 2 1   */

import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<9; i++) {
            for(int j=0; j<9-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
