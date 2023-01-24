/* Typecasting   OR   Narrowing Conversion   OR   Explicit Conversion*/

float a= 30.99999999f;
int b= (int) a;   //TYPECASTING a float into int.
System.out.println(b);    // Gives 30 as output  --> No round off will be done .

char ch ='a';
int number =ch;   
System.out.println(number);  //  Gives 97  
/*  Why it gave 97 as output. It must have given ERROR in output, as no typecasting is being done here
Unlike the previous case  */
