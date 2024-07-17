import java.util.Arrays;

public class Binary_2d_example2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 16, 15, 14, 13 },
                { 12, 11, 10, 9 },
                { 8, 7, 6, 5 },
                { 4, 3, 2,1 },
        };
        int [] x = mid(arr, 10);
        System.out.println(Arrays.toString(x));
    }

    

    static int [] mid(int[][] arr, int target) {
        int row= arr.length;
        int col= arr[0].length;
        int start = 0;
        int end = row*col - 1;
        while (start <= end) {
            int mid = start+ (end- start) / 2;
            int midvalue=arr[mid/row][mid%col];
            // this is for descending                                 
                    // if (target == midvalue) {
                    //     return new int[] {mid/row,mid%col};
                    // }
                    // if (target > midvalue) {
                    //     start = mid + 1;
                    // }
                    // if (target < midvalue) {
                    //     end = mid - 1;
                    // }
        //    this for ascending
        // if (target == midvalue) {
        //     return new int[] {mid/row,mid%col};
        // }
        // if (target > midvalue) {
        //     start = mid + 1;
        // }
        // if (target < midvalue) {
        //     end = mid - 1;
        // }
                
            
        }
        return new int []{-1,-1};

    }

}
