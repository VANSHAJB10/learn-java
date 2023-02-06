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
