public class Rotated_array_count {
    public static void main(String[] args) {
        int[] arr={15,18,2,3,6,12};
        int z =pivot(arr);
        System.out.println(z+1);
    }
    static int pivot(int []nums){
        int start=0;
        int end= nums.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return start;
    }
    
}
