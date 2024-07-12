// this code can detsct pivot point event for duplicate values
public class Pivot {
    public static void main(String[] args) {
        int[] nums = { 2,9,2,2,2,2 };
        int z = pivot(nums);
        int k = binary_search_Asc(nums, 9, z);
        int l =  binary_search_Asc1(nums, 9, z);
        
        if(k!=-1){
            System.out.println(k);
        }
        else if(l!=-1){
            System.out.println(l);
        }else{
           System.out.println(-1);
        }

        System.out.println(z);
    }
    static int pivot(int[]nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid+1]) {
                return mid;
            } 
            if(nums[mid]==nums[start]&&nums[mid]==nums[end]){
                start++;
                end--;
            }
            
            if(nums[start]>nums[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return start;
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
    static int binary_search_Asc1(int[] arr, int target, int z) {
        int start = z+1;
        int end = arr.length-1;
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
    
}
