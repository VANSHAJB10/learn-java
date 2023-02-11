/*
Narayana friends ask him to write a java code to find the sum of all even number which is store in one dimensional array.
if the array does not have any even number then print 0 else print the sum.

Input Format:
Accept the size of array n
Enter the n number of element.

Constraints:
5 < n > 50

Output Format:
print the sum
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n]; // array declaration with memory allocation
        for (int i = 0; i < n; i++) {
                                    // reading array elements from the user
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) { // traverse the array from index 0 to index n
            if(arr[i] %2 == 0) {
            sum = sum + arr[i]; // calculating the sum of all the array elements
            }
        }
        
        System.out.println(sum);
        sc.close();
    }

}
