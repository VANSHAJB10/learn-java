/* Karan has been given a task by Head of Librarian to implement the enumeration of the Library working Day and timing. 
Which have the 3 attributes i.e. day and open timing and close timing of the library working hours.
Details of the working hours are:

Day, open Timing, closed timing

Monday, 8.30, 5.30
Tuesday, 8.30, 5.30
.
.
Friday, 8.30, 5.30
Saturdays, 9.30, 4.30

Karan is supposed to write a main class in which the name of working days of library is taken as input as a day and timing of 
library should be displayed using switch statement. 
If the input given is not matching with the listed day, display Library is closed

Input Format:
First line of the input reads the day

Constraints:
NA

Output Format:
if working day than
Prints the open time and closed seperated by SPACE.
else
Prints Library is closed */

import java.util.*;
public class hackerrank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        if(day.matches("Saturday")){
            System.out.println("9:30 4:30");
        }
        else if(day.matches("Sunday"))  {
            System.out.println("Library is closed");
        }
        else{
            System.out.println("8:30 5:30");
        }
        scan.close();
        }
    }
