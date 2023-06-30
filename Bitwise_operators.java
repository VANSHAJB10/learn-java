public class Bitwise_operators{
  public static void main(String [] args) {
    int a=9,b=10;

        /* Bitwise operators ==>
          1. OR                |
          2. AND               &
          3. Exclusive OR      ^
          4. Complement        ~        Compiler will give 2’s complement of that number
          5. Signed Left shift        <<       written as  a << b   ;  b is the number of times Left shift is being implemented  ;  (it is equivalent to ==>  a* 2(pow b) )
          6. Signed Right Shift       >>       written as  a >> b   ;  b is the number of times Right shift is being implemented  ;  (it is equivalent to ==>  a / 2(pow b) )
        */  

    System.out.println(q | b);
    System.out.println(a & b);
    System.out.println(a ^b);

    System.out.println(~a);
    System.out.println(~b);
                                                      // Auxiliary space:O(1) 
                                                      // Time complexity:O(1) 
    System.out.println(a << 1);
    System.out.println(a << 2);

    System.out.println(a >> 1);
    System.out.println(a >> 2); // 2 times right shift

  }
}

// A bitwise operator is a symbol/notation that performs a specified operation on standalone bits, 'taken one at a time'.                     ** IMPORTANT **
// It can be used with various integer types – char, int, long, short, and byte.                                                                    |
                                                                                                                                                    |
/* The advantages of using Bitwise Operators:                                                                                                       |
    1. 'Speed': Bitwise operations are much faster than arithmetic operations as they operate directly on binary representations of numbers.   <----|
    2. Space Optimization: Bitwise operations can be used to store multiple values in a single variable, which can be useful when working with limited memory.
    3. Bit Manipulation: Bitwise operators allow for precise control over individual bits of a number, which can be useful in various applications such as cryptography, error detection, and compression.
    4. Code Simplification: Bitwise operations can simplify the code by reducing the number of conditional statements and loops required to perform certain tasks.
    5. Improved Readability: Bitwise operations can make the code more readable by encapsulating complex logic into a single operation, making the code easier to understand and maintain.
*/
