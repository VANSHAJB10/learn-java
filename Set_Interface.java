import java.util.*;  // Hashset is included in this package 

class Set_Interface{  

public static void main(String args[]){  
    HashSet<String> set=new HashSet();  

           set.add("Element1");    
           set.add("Element2");  
           set.add("Element3"); 
           set.add("Element4"); 
           set.add("Element5"); 
           
           System.out.println("Hashset Elements --> ");
           System.out.println(set);
           
            LinkedHashSet<String> linkhashset= new LinkedHashSet();
            linkhashset.add("HS1");
            linkhashset.add("HS2");
            linkhashset.add("HS3");
            linkhashset.add("HS4");
            linkhashset.add("HS5");
            
            System.out.println("Linked Hashset Elements --> ");
            System.out.println(linkhashset);
 

            TreeSet<String> treeset= new TreeSet();
            treeset.add("TS1");
            treeset.add("TS2");
            treeset.add("TS3");
            treeset.add("TS4");
            treeset.add("TS5");
            
            System.out.println("Tree set Elements --> ");
            System.out.println(treeset);
  }  
} 
