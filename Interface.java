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




/***** Some points toemember *****/
*default can be called using class object but not using interface names. 
*overwriting default methods becomes necessary in case of ambiguities else its not compulsary to overwrite

* static can be called using interface name
   
*QUESTION --> Can 2 parent interfaces have  static methods with same signature?
 *ANSWER -->   YES , becoz... 


* Interfaces specifies what class must do but not how it does. Interface contains the only declaration of the method.  
* By default, interface contains abstract methods
* Concrete classes must implement all methods in an interface. 
* All variables in interface are implicitly final and static.   ***Important*** They are usually written in capital letters.
* Through interface multiple inheritance is possible.

* When a constructor is defined for an interface --> it gives Compilation failure
* Constructor is not provided by interface as objects cannot be instantiated.

* when we access the same variable defined in two interfaces implemented by the same class. The interfaceName.variableName needs to be defined. The JVM needs to distinctly know which value of variable it needs to use. 




 /**/ ************* Functional Interface ***************/**/

*it specifies only one abstract method
*equals and toString() method belong to Object class 
*methods of object class allows to have more than one
