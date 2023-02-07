/* Write a program to convert the double type of array into int type array. 
If any value in the input array will be negative, display the message “Invalid Array Elements” otherwise display the elements of int type converted array.

 Input Format:
 Your program should take the two types of input. First input will represent size of array and second will represent the values of array. If the size of the array will be negative, display the message “Invalid Array Size” without asking any other input.

 Constraints:
 Size of the array should be positive
 All the elements of the array should be positive

Output Format:
If the size of the array will be negative, display the message “Invalid Array Size” without asking any other input.
If all the input elements of the array are positive (including 0) then display the elements of int array otherwise display the message “Invalid Array Elements”. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Array Size");
            System.exit(0);
        } else {
            float[] array = new float[size];
            for (int i = 0; i < size; i++) {
                float n = sc.nextFloat();
                if (n < 0) {
                    System.out.println("Invalid Array Elements");
                    System.exit(0);
                } else {
                    array[i] = (int) n;
                }
            }
            int[] array2 = new int[size];
            for (int i = 0; i < array.length; i++)
                array2[i] = (int) array[i];
            for (int i = 0; i < array.length; i++)
                System.out.println(array2[i] + " ");
        }
    }
}
