/*remove spaces in a string*/
public class Example {
  public static void main(String[] args) {

    String str="Hi, Welcome to google.com";
    System.out.println("Original String:" + str);

    //Using regex inside replaceAll() method to replace space with blank
    str = str.replaceAll("\\s+", "");
    System.out.println("String after white spaces are removed:" + str);
  }
}
