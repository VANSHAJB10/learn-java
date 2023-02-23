/* Abstract class is a class which has abstract in front of it. It may or may not have abstract methods
 * Abstract class cannot be instantiated . But it can be inherited.
 * Abstract methods are methods without body,having abstract method in front of it
 * If a class is inheriting a abstract class it requires to give definition to all its abstract methods
 * however if a child class is not gining def to abstract method it itself is required to be declared as abstract
 */

abstract class Demo{
    abstract void fun();  // creating a empty method // to declare a abstract method the class should also be abstract
    // purpose of emtpy method();
}

abstract class Car {
    void drive(){   //non abstract method
        int speed = 20;
    }
//its not compulsary that abstract class must have a abstract method
// in such case the use case maybe not wanting any user to instantiate the class or not allowing anyone to create the object of class
    abstract void fly(); //abstract method
}

class Nano extends Car{
    void fly(){
        System.out.println("Nano is flying");
    }
}

public class Abstract_class {
   // Car c = new fly();  //its not allowed to create a object of abstract class;
      
    
}
