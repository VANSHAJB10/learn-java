public class Main {

        public static void main(String[] args)   {
          
          String str = "Vanshajb10";
          int before = str.length();
          String str2 = str.replace("a","");
          
          int after = str2.length();
          
          System.out.println("Number of occurences of 'a' is : "+ (before-after));
        }
}
