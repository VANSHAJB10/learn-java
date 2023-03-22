/*
 * static members have only one copy which is shared by all the objects of the
 * class
 * static variable/method can be accessedby using classname directly.
 * 
 * variable with 'static' in front of it is called "class variable".
 * 
 * static class is also possible but only nested classes can be static ... outer
 * class can ever be static.
 * static method cannot access non-static variables/members
 */


/* */ .hasNext()  method /* */
↪ built-in method of the Java 'Scanner' class.
↪ used to check if there is more data available to be read from an input stream.
↪ returns a boolean value depending on whether or not there is more data to be read.

↪ The hasNext() method is useful when you need to read an unknown amount of input, 
  such as when reading input from a user or from a file with an unknown number of lines.
  ↣ By using hasNext() to check for more data, you can avoid reading past the end of the input and causing errors in your program.
