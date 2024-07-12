import java.util.Arrays;

public class Linear_2d {
    public static void main(String[] args) {
        int [][]  arr={{1,3,5},{23,4,6},{24,56}};
        int[] ans=check_max(arr,5);
        System.out.println(Arrays.toString(ans));
    }
    static int []check_max(int [][]arr,int target){
           
            for(int i=0;i<arr.length;i++ ){
                for(int j=0;j<arr[i].length;j++){
                    if(target==arr[i][j]){
                        return new int[] {i,j};
                    }
                }
            }
            return new int[]{-1,-1};
    }
}
