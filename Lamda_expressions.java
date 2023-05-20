/*
** Lambda expressions basically express instances of 'Functional interfaces'.     -->    (An interface with a single abstract method is called a functional interface).
** Lamda expression = Lambda Function, which is short block of code that take parameters as input and returns a resultant value.
** Lambda Expressions are recently included in Java SE 8. 


** Lambda Expressions implement the only abstract function and therefore implement functional interfaces.
** Its functionalities are--
  -- Enable to treat functionality as a method argument, or code as data.
  -- A function that can be created without belonging to any class.
  -- A lambda expression can be passed as if it was an object and executed on demand.
  
** Syntax of Lambda expression:
   lambda operator -> body  
  
**  
// Java program to demonstrate lambda expressions to implement a user defined functional interface.

// A sample functional interface (An interface with single abstract method

interface FuncInterface
{
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun()
	{
	System.out.println("Hello");
	}
}

class Test
{
	public static void main(String args[])
	{
		// lambda expression to implement above functional interface. This interface by default implements abstractFun()
		FuncInterface fobj = (int x)->System.out.println(2*x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
	}
}


** Number of parameters of Lambda expression:
  Lambda expression can be of three type based on number of parameters it is taking:
-- Zero Parameter
-- Single Parameter
-- Multiple Parameters

1. Lambda Expression with Zero parameter:
() -> System.out.println("Zero parameter lambda");

2. Lambda Expression with Single parameter
(p) -> System.out.println("One parameter: " + p);

IMPORTANT!! --> It's not mandatory to use parentheses if the type of that variable can be inferred from the context

*/
