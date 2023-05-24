/* Class & Object */
* Object - real world entities
* Class - collection of object (similar kind of objects) 

/*Class*/
* has attributes + functions 
* name of class start with CAPITAL Letter (only a convention will not give error if not followed)
* 'Syntax' To make an object of a class
    Classname obj = new Classname(); // new keyword reserves a memory space in heap for the object
* to call the function of a class:    '.'  operator is used
* Syntax to call function of class
    ob.func1();


/* Access modifiers */
* keyword that tell which var can access which piece od code/data
* There are 4 types of access specifiers --
                                            Private
                                            Default
                                            Protected
                                            Public
/* getter an dsetter */
* getter methods are be used to access the private variables of a class outside the class
* this keyword is used to refer the calling object: more percisely 'current object'



/* 4 Pillars of OOPS */
/* 1.Encapsulation */
* Wrapping up of data and methods under a single entity.
* It implements 'data hiding'

    
/* 2.Constructor */
* Constructor overloading - when program itself decides which cnstructor to call among may available constructors
* Constructor overloading is example of Polymorphism

    /* Copy Constructor */
    * Copying values of 1 constructor into other constructor
    * Student s2 = Student(s1);
            This creates a new constructor- s2 whic is a copy of s1.
            Student (Student s1){
            this.name = s1.name;
            this.rollno= s1.rollno;    
            } 
