/*Write a program to take the input of int type which represents the number of rows and display the following type of pattern up to those rows. 
If the input will be negative number, display the message “Invalid Rows” without pattern. Pattern for 4 rows: 
@@@@ 
@@@ 
@@ 
@


*/

import java.util.Scanner;

public class pat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 0){
            for(int i=x; i>0; i--){
                for (int j=i; j>0; j--){
                    System.out.print("@");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid Rows");
        }
    }
}
