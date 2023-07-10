/* It shows only essential things to the user and hides the internal details.
 *Abstract class is a class which has abstract in front of it. It may or may not have abstract methods
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


/*
*** Factory mehod *** 
A factory method is a method that returns the instance of the class.
*/


/*There are two ways to achieve abstraction:

--> Abstract class (0 to 100%)
--> Interface (100%)

* An abstract class can have abstract and non-abstract methods.
* It needs to be extended and its method implemented. 
* It cannot be instantiated.
* It can have constructors and static methods also.
* It can have final methods which will force the subclass not to change the body of the method.
*/

/*
Abstract classes vs. interfaces
An interface is another similar way to create an abstraction. Like abstract classes, interfaces can't be instantiated. But unlike abstract classes, an interface method can be set as abstract.

Abstract classes can also have final, nonfinal, static and nonstatic variables, whereas an interface has only static and final variables. Additionally, abstract methods can define public, protected and private concrete methods, while interfaces have all fields as automatically public, static and final. Interfaces, however, support multiple inheritances where abstract classes don't.

Implementation is done similarly in Java. For example, using the keyword implements will make a Java interface, while the keyword extends makes an abstract class.
*/

/* Abstractions vs encapsulation
 The implementation and state of each object are privately held inside a defined class. Other objects don't have access to this class or the authority to make changes; they're only able to call a list of public functions or methods. This characteristic of data hiding provides greater program security and avoids unintended data corruption, while also making code easier to maintain and reuse.

Encapsulation is done by declaring all the variables in a class as private while writing methods declared as public to set and retrieve variable values.

While abstraction is the process of hiding unwanted data, encapsulation is the process of hiding data with the goal of protecting that information. While abstraction is achieved using abstract classes or interfaces, encapsulation is implemented using an access modifier.
*/
