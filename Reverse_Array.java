import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        if(i<j){
            swap(arr,i,j);
        }
       


    }
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
