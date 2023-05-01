public class Main {

        public static void main(String[] args)   {
          
          String str = "Vanshajb10";
                
/*Approach 1*/                
          int before = str.length();
                /*Method 1*/
          String str2 = str.replace("a","");                                             // replacing the character to be counted with empty char and finding the difference in both the lengths.
          int after = str2.length();  
                /*Method 1 ends*/
                
                
                /*Method 2*/
          int after = (str.replace("a","")).length();
                /*Method 2 ends*/
                
          System.out.println("Number of occurences of 'a' is : "+ (before-after));
/*Approach 1 ends*/          
                
                
                
/*Approach 2*/ 
           char [] ca = str.toCharArray();                                              // converting the string into a char array
           int count = 0;
                
          for(int 1=0 ; i<str.length() ; i++ ){
                if(ca[i] == 'a'){
                    count++;  
                }
          }
                
          System.out.println("Number of occurences of 'a' is : " + count);
/*Approach 2 ends*/                 
        }
}
