public class Main {
    public static float  getShortestPath (String path){
         int x =0 , y =0;
         for (int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir =='N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
         }
         int X2 = x*x;
         int Y2 = y*y;
         return (float)Math.sqrt(X2 +Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path for default directions is: " + getShortestPath(path));
    }
}


/* With custom input from user */
import java.util.Scanner;
public class Main {
    public static float  getShortestPath (String path){
         int x =0 , y =0;
         for (int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir =='N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
         }
         int X2 = x*x;
         int Y2 = y*y;
         return (float)Math.sqrt(X2 +Y2);   //Dostance formula
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path for default directions is: " + getShortestPath(path));

        //Custom input
        System.out.println("Enter path in terms of direction. \n");
        System.out.println(" N for North \n S for South \n W for west \n E for East");
        Scanner sc = new Scanner(System.in);
        String path2 = (sc.nextLine());
        path2.toUpperCase(); // to convert userinput according to if else conditions
        System.out.println("Shortest path for " +path2 + " is: " +getShortestPath(path2) ); // shortest distance of path taken from User

        sc.close();
    }
}
