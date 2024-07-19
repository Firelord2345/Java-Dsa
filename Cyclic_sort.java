import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int [ ] arr){
          int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (i != correct_index) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else {
                i++;
            }
        }
    }
}
