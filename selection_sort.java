import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        selection__sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection__sort(int[] arr) {
       
        for (int i = 0; i <= arr.length-1; i++) {
            int last = arr.length-i-1 ;
            int max_index = get_index(arr, last);
            swap(arr, max_index, last);
        }

    }

    static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        
    }

    static int get_index(int[] arr, int last) {
        int max = 0;
        for (int i = 1; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max=i;
            }
        }
        return max;
    }
}
