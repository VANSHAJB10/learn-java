/*Write a java program to find common elements present in 3 different arrays. and print them in assending order.

Input Format:
first line accept the Size of 1st array
Sencond line accepts the elements of the first array
third line accept the Size of 2nd array
fourth line accepts the elements of the 2nd array
fifth line accept the Size of 3rd array
sixth line accepts the elements of the 3rd array

Constraints:
size of all arrays must be >o
all elements of the array must be integers

Output Format:
print the common elements present in 3 different arrays in assending order.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++)
            arr3[i] = sc.nextInt();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) i++;
            else if (arr2[j] < arr3[k]) j++;
            else k++;
        }
    }
}
