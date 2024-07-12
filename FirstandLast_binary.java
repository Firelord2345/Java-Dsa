import java.util.Arrays;

public class FirstandLast_binary {
    public static void main(String[] args) {
        int[] arr = { 2,2 };
        int target = 2;
        int[] a = { -1, -1 };
        a[0] = binary_search(arr, target, true);
        a[1] = binary_search(arr, target, false);
        System.out.println(Arrays.toString(a));
    }

    static int binary_search(int[] nums, int target, boolean first_index) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                result = mid;
                if (first_index) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return result;

    }
}
