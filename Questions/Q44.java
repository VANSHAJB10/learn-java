/* Raman written the essay and now he wants to count the occourance of mentioned string in his essay.
Write a program to help him to find the occurance of user entered string in the essay.

Input Format:
the first line will contain user defined string whose occurence need to be search
second line will contain the string where the search need to be done

Constraints:
na

Output Format:
integer value which will represent the count */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String substr = sc.nextLine().trim();
        String essay = sc.nextLine().trim();
        int count = countSubstring(essay, substr);
        System.out.println(count);
    }
    private static int countSubstring(String str, String substr) {
        int count = 0;
        int pos = 0;
        while ((pos = str.indexOf(substr, pos)) != -1) {
            count++;
            pos += substr.length();
        }
        return count;
    }
}
