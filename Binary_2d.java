
import java.util.Arrays;

public class Binary_2d {
    public static void main(String[] args) {
        int [][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50},
                 };
        System.out.print(Arrays.toString(binary(arr,37)));
    }
    static int[] binary(int[][]arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length &&j>=0){
           if(target==arr[i][j]){
               return new int []{i,j};
           }
           if(target>arr[i][j]){
              i++;
           }
           if(target <arr[i][j]){
              j--; 
           }
        }
        return new int [] {-1,-1};

    }
}