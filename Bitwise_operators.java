public class Bitwise_operators{
  public static void main(String [] args) {
    int a=9,b=10;

        /* Bitwise operators ==>
          1. OR                |
          2. AND               &
          3. Exclusive OR      ^
          4. Complement        ~
          5. Left shift        <<       written as  a << b   ;  b is the number of time Left shift is being implemented  ;  (it is eauivalent to ==>  a* 2(pow b) )
          6. Right Shift       >>       written as  a >> b   ;  b is the number of time Right shift is being implemented  ;  (it is eauivalent to ==>  a / 2(pow b) )
        */  

    System.out.println(q | b);
    System.out.println(a & b);
    System.out.println(a ^b);

    System.out.println(~a);
    System.out.println(~b);

    System.out.println(a << 1);
    System.out.println(a << 2);

    System.out.println(a >> 1);
    System.out.println(a >> 2); // 2 times right shift

  }
}

// A bitwise operator is a symbol/notation that performs a specified operation on standalone bits, 'taken one at a time'.
// It can be used with various integer types – char, int, long, short, and byte.

