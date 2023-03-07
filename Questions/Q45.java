/*Amit purchased one calculator for performing some calculation on it. 
He is running a company which develop machines. 
He want to calculate total sale of today. 
But he is not able to calculate sum of two numbers because numbers are having more than nine digits. 
Help the Amit to calculate sum of two integer values having more than 9 digits ao that he will be able to do calculations.

Input Format:
First line will contain one integer value having more than nine digits.
Second line will contain one integer value having more than nine digits.

Constraints:
Number of digits in numbers will lie between 10-20.

Output Format:
Sum of two integer values if numbers satisfy the constraint else print Invalid Input */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine().trim();
        String num2 = sc.nextLine().trim();
        if (num1.length() < 10 || num1.length() > 20 || num2.length() < 10 || num2.length() > 20) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if (num1.length() < num2.length()) {
            num1 = padWithZeroes(num1, num2.length() - num1.length());
        } else {
            num2 = padWithZeroes(num2, num1.length() - num2.length());
        }
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digitSum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + carry;
            if (digitSum > 9) {
                carry = 1;
                digitSum -= 10;
            } else {
                carry = 0;
            }
            result.append(digitSum);
        }
        if (carry == 1) {
            result.append('1');
        }
        System.out.println(result.reverse().toString());
    }
    private static String padWithZeroes(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

