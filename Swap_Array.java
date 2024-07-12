import java.util.Arrays;
import java.util.Scanner;

public class Swap_Array{
    public static void main(String[] args){
      int[] arr = {1,2,3,4,5};
      swap(arr,1,4);
      System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]= temp; 
}
    
}