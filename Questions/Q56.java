public class Main{
  public static void main(String [] args){

  String str = "A  B  C  D";
  String str2= str.replaceAll("\\s","");    // replaceAll() method takes two parameter --> ("regex", "parameter to be replaced with")
                                                                                    // regular expression of whitespace is  -->  \\s    
    // instead of regex as the first parameter, whitespace (" ") can also be passed 
  System.out.println(str2);
  }
}
