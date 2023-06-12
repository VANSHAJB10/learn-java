/* INHERITANCE
* Inheritance is widely used in java applications, 
  For example extending the Exception class to create an application-specific Exception class that contains more information such as error codes. 
  eg. NullPointerException.


 * Multiple inheritance is not allowed in java.
 * it is resolved at runtime that method of which class will be called in case there are same method name in parent as well as child class
 
 *Important*
 Car c = new Car();  --> here c is reference variable and new Car() is object.

*Focus*
 Car cc =new Waganor();
 cc.drive; --> drvie of Waganor() is executed
 cc.fly(); --> generates compile timeerror

 if creating a obj of child class and using ref. var. of parent class then it will not show error 
 if  same method is present in parent and child class else it will be a compile time error
 
 we cant store parent class obj in child class reference.
 */

class Car {
    void drive() {
        System.out.println("drivig Car");

    }
    void color(){
        System.out.println("Car has 4 colors");
    }
}
class Porche extends Car{
    void drive(){
        System.out.println("Driving Porche");   /* Method pverriding */
    }
    void drive(int speed){                               /* FOCUS! */
        System.out.println("Driving Porche");   /* NOT Method pverriding */  /* its Function Overloading */
    }
    void color(){
        System.out.println("Orange Porche");
    }
}

public class Inheritance {
    Car c = new Car();
}


/*2*/
package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

   // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}


/*
  Method overriding - 
  Its redefining the parent class method inside child class.
  Overridding alwys take place in case of inheritance.

  The whole header should match - name , return type , parameter initialisation
 */
