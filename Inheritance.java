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
