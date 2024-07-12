public class Leet_1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int z = mountain_peak(arr);
        int k = binary_search_Asc(arr, 3, z);
        int l = binary_search_Desc(arr, 3, z);
        int min = k;
        if (k >= l) {
            min = l;
        }
        System.out.println(min);
    }

    static int binary_search_Asc(int[] arr, int target, int z) {
        int start = 0;
        int end = z;
        while (start <= end) {
            int mid = start + (end - start) / 2;
             
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            

            if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    static int binary_search_Desc(int[] arr, int target, int z) {
        int start = z;
        int end =arr.length-1 ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }

            if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    static int mountain_peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end=mid;
            } else {
                start= mid+1;
            }
        }
        return start;
    }
}
