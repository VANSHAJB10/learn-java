/* Q1 -->  Will the following statement give any error in Java?
int $ = 24 */
Ans --->  No, the statement will not give any error.
Names of variables are called identifiers in Java. Identifier rule says, identifiers can start with
any alphabet or underscore (“_”) or dollar (“$”).

/* Q2 --> */
class Test   
{  
    public static void main (String args[])   
    {  
        System.out.println(10 + 20 + "Java");   // 30Java
      /*  0 and 20 are treated as numbers and added to be 30. Now, their sum 30 is treated as the string and concatenated with the string Java. */
      
        System.out.println("Java" + 10 + 20);   //Java1020
      /* The string Java is concatenated with 10 to be the string Java10 which will then be concatenated with 20 to be Java1020. */ 
    }  
} 

/* Q3 --> */
class Test   
{  
    public static void main (String args[])   
    {  
        System.out.println(10 * 20 + "Java"); //200Java  
        /* The numbers 10 and 20 will be multiplied first and then the result 200 is treated as string and concatenated with string Java to produce the output 200Java. */
        
        System.out.println("Java" + 10 * 20); //Java200
        /* The numbers 10 and 20 will be multiplied first to be 200 because the precedence of the multiplication is higher than addition. 
        The result 200 will be treated as the string and concatenated with the string Java to produce the output as Java200. */
    }  
}  

/* Q4 --> */
class Test   
{  
    public static void main (String args[])   
    {  
        for(int i=0; 0; i++)   
        {  
            System.out.println("Hello Javatpoint");  
        }  
    }  
}  
/*output = error 
--->  because the for loop demands a boolean value in the second part ; and we are providing an integer value, i.e., 0. */

/* Q5 */
Note --> If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; 
because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine()
will be reading the remainder of the integer line (which is empty).

Solution for this -->
/*solution 1*/
Use an additional nextLine() method to consume the newline character that was left in the buffer after the integer input. 

For example:
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
scanner.nextLine(); // consume the newline character
String text = scanner.nextLine();

/*solution 2*/
use the trim() method to remove any leading or trailing whitespace from the input string. 
This will remove the newline character that was left in the buffer after the integer input. 

For example:
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
String text = scanner.nextLine().trim();


/* Q6 */
To make a string left justified and within a field of 15 characters.

String str = "Hello, world!";
String leftJustified = String.format("%-15s", str);
System.out.println(leftJustified);
