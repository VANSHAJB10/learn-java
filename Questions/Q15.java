/*Alex has a friend from India .He want to save the Mobile number of his friend with 91 extension.
Help Alex to store the contact number of his friend in apporpriate mannner and If the number is valid then print "Number Saved” else print ”Enter Valid Number”.

Input Format:
In First input line, you should enter contact number of Alex friend.

Constraints:
Enter only positive value.
N

Output Format:
Print “Number Saved” else print ”Enter Valid Number”.*/

import java.util.*;
public class phone_number{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
long a = scan.nextLong();
String s=String.valueOf(a);
if(s.length()==12){
    if(s.matches("91(.*)")){
        System.out.println("Number Saved");
}
}
else
    System.out.println("Enter Valid Number");
scan.close();
}  
}
