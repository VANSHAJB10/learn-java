/* 
Errors -->
Types : 
    1. logical Errors
    2. syntax Errors
    3. runtime Errors ---> Exceptions

Logical errors - Occurs when a prog is compiled and it runs but gives wrong output.

Runtime errors - The program crashes abruptly while running
They are called exceptions.



Exceptions -->
Exception is a class and to find out which type of exception has occured ... and object of the Exception can be created and printed to get the exception name as output.

If the exception is not handled using try catch block the program will not execute from that point.

Causes of runtime errors(exceptions)-->
    1. Resource constraint
    2. Bad input
    3. Divide by zero

*** Runtime errors must not be ignored while development of a program. They must be handled to keep up user experience and satisfaction ***


Built-In exceptions in Java -->
    1. NullPointerException: This is the most happening exception. This exception throws if the system expects an object but actually it was null.

    2. IndexOutOfBoundsException: This exception indicates that if the index is out of range.

    3. ConcurrentModificationException: If the concurrent modification happening on a method that is not permissible, then this thrown

    4. UnsupportedOperationException: If the requested operation is not supported then the UnsupportedOpertionException threw.

    5. ArithmeticException: Thrown if the exceptional arithmetic condition occurs

    6. NumberFormatException: Thrown if the application converts a string to a numeric value, but the string doesn't have the proper format.
    
 */
