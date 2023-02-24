/*In some organization, January is the month of giving appraisal to employees, 
so HR department of that organization decided to give appraisal to only those employees
whose employee id is more than 201. In that organization every employee is getting basic salary is 20,000INR and when employee id 
is greater than 201 then company decides to give appraisal of 1000INR to every employee. So as a programmer help that company 
to check who is eligible for getting incentive.

Input Format:
In First Line, enter employee ID
In Second Line, enter employee name
In third Line, enter employee designation

Constraints:
Check is on employee ID, and employee id must be of integer type.

Output Format:
If employee id is greater than 201, only then salary is increased by 1000 INR and display name, 
employee id and increased salary of employee, if employee id is less than 201 then print “No Appraisal”.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int ID =sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String designation = sc.nextLine();
        if(ID<201){
            System.out.println("No Appraisal");
        }
        else{
            System.out.println(name+"\n"+ID+"\n21000");

        }
        sc.close();
    }
}
