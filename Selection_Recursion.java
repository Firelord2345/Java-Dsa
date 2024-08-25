import java.util.*;
public class Selection_Recursion {
    public static void main(String[] args) {
        int arr[]={2,5,3,1};
        Selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
         
    static void Selection(int arr[],int r, int c,int max) {
       
        if (r == 0) {
            return;  // Base case: stop recursion when rows are 0
        }
        if (c < r) {  
            if(arr[c]>arr[max]){
                Selection(arr, r, c+1, c);
            }else{
                Selection(arr,r, c + 1,max);
            }
             
          
        } else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            Selection(arr, r-1, 0, 0);
        }
    }
}
