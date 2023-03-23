*** Interface ***

Multiple inheritance can be implemented using Interfaces

 * we can have abstract method inside interface
 * 
 * if u want to give body to a method u have to make it default or static
 * eg.  
  default void playGame(){
   statement 1...;
  }
 
 * They cannot be instatiated , can be only implemented by class or extended by other interfaces.
 * Interfaces cannot have an object
  
 * By default variable are static and public
 * By default methods are sttic and public
 

 /***/**************** *** Implementation of Interfaces *** ******************/***/

interface interface1_name{
    void emptyfunc();
    void method1();
}

class Main implements interface1_name, interface2_name{
    public void emptyfunc(){
        System.out.println("implementing")
    }
    public void method1(){
        
    }

    public static void main (String args[]){
        System.out.println("Main function starts here");

    }
}
