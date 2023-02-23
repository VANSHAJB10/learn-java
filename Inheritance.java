/* multiple inheritance is not allowed in java.
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
