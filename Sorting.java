/*Bubble Sort*/

/*Code*/
public class Main {
    static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n-1; i++){   
            for(int j = 0; j < n-i-1; j++){
                
                if(a[j] > a[j+1]){
                    // swap - a[j], a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                  }
            }
           
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 2, 3, 6, 0};
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

/*Modified Bubble Sort*/  // With flag variable
public class Main {
    static void bubbleSort(int[] a){
        int n = a.length;
        // n-1 iterations/passes
        for(int i = 0; i < n-1; i++){
            boolean flag = false; // has any swapping happened
            for(int j = 0; j < n-i-1; j++){
                /*
                last i elements are already at correct sorted positions,
                so no need to check them
                 */
                if(a[j] > a[j+1]){
                    // swap - a[j], a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true; // some swap has happened
                }
            }
            if(!flag){ // have any swaps happened?
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 2, 3, 6, 0};
        bubbleSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
