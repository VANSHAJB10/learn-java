/* Typecasting   OR   Narrowing Conversion   OR   Explicit Conversion*/

float a= 30.99999999f;
int b= (int) a;   //TYPECASTING a float into int.
System.out.println(b);    // Gives 30 as output  --> No round off will be done .

char ch ='a';
int number =ch;   
System.out.println(number);  //  Gives 97  
/*  🔥DOUBT! -->  Why it gave 97 as output. It must have given ERROR in output, as no typecasting is being done here
Unlike the previous case  */



/* Type Promotion */

public class Typeconversion{
  public static void main(String args[]){
    char a ='a';
    char b='b';
    
    char c= a-b;   /*Concept 1*/   // --> This line gives error   
    
    System.out.println(b-a);  /*Concept 2*/   // --> This gives 1 as output
    /*  If there is a expression (addition, multiplication etc) in print statement and the datatype of operand is byte or short or char then it it promoted to int datatype
        This is called --> Type Promotion*/
    /* Same is the reason for the error in line 20 where (a-b) has now been promoted to int datatype and we are trying to assign its value to c which is of char datatype. */
  }
}
