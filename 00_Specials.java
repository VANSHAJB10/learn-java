Programming platforms typically have hidden or private test files and test cases. What are these?

Private test files check for the following
Test your code for logic
Test your code for corner cases / edge cases
Test your code for handling scale -> does your program solve within time and space constraints?

What do these private test files do?
Your code is run on each test case within the private test file
This generates your actual output
This is judged against the expected output.
If the actual output and expected output match, then your code is correct


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

/* 7 */
sc.nextString() takes input as string and not as integer while next() takes the input in integer and string both.
So ot take integer input from user, either use sc.next() or sc.nextInt().


// **  AVOID THESE!!  **
1. Unisng Mutable and immutable objects
    There’s a careful balance to strike when choosing between creating a mutable or immutable object.
    A mutable object can be modified after creation, whereas an immutable object cannot. 
    While immutable objects offer benefits such as safety, simplicity, and reduced memory, they build up garbage collection when requiring a separate object for each distinct value.
        
        Mutable:

        When changes are made to the object, no new object is formed.

        Methods are provided to change the content of an object.

        Both getter and setter methods are present.

        Common examples include StringBuffer , StringBuilder, and java.util.date.
            
            
        Immutable:

    A new object is formed when an existing object is changed.

    No methods are provided to change the content of an object.

    Only getter methods are present. There are no setter methods.

    Common examples include all legacy classes, wrapper classes, and String classes.
        
        
        
 2. Confusing  = , == , .equals()
     = is used for assignment. == is a referential equality comparison, meaning it checks whether both objects point to the same memory location. 
     .equals() evaluates whether the two objects are equal in value.
       
     'As a rule of thumb, stick to .equals() when comparing objects, especially strings.'
         
 String a = "hello";
 String b = "world";
 
 if ( (a+b).equals("helloworld") )
 {
    System.out.println("hellowworld");
 }



3. Using ArrayList instead of LinkedList
It’s easy to default to using ArrayLists, since they’re more common and familiar. However, LinkedLists perform significantly better than ArrayLists in many use cases.
In general, ArrayLists are better suited when the application demands storing and access of data. LinkedLists are better when the application demands manipulation of the stored data.
    
    
    ArrayList:

    Uses a dynamic array to store elements.

    Takes more time to manipulate the ArrayList due to the internal implementation of shifting memory bits.

    Implements a List interface and therefore acts as a list.

        
    LinkedList

    Uses a doubly linked list to store elements.

    Takes less time to manipulate a LinkedList compared to an ArrayList, since in a doubly linked list, there are no shifting memory bits.

    Implements both the List interface and the Deque interface and therefore can act as both a list and deque.

/* !! 1  !! */
Java.lang is a superclass of all classes.
The object is the root class for all the java classes and we don’t need to extend it. 
Every other java classes fall back under the object. 
All the different non-primitive types including arrays are inherited directly or indirectly from this class.

/* !! 2 - What are finally and finalize in Java? !! */

Finally block is used with a try-catch block to put the code that you always want to get executed even the execution is thrown by the try-catch block.  
Finally is just used for releasing the resources which were created by the try block.

Finalize() is a special method in Object class that we can override in our classes. 
Finalize() is called by the Garbage collector to collect the garbage value when the object is getting it. 
This method is generally overridden to release the system resources when garbage value is collected from the object.
