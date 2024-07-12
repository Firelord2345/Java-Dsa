public class Split_Array_Sum {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
        int z=min_larget_sum(nums, k);
        System.out.println(z);

    }

    static int min_larget_sum(int[] nums, int k) {
        int i, j;
        int s = nums.length;
        j=s;
        i = s - j;
        
        int sum=0;
        
        sum+=nums[j];

        return sum;
       
        // max = Math.max(sum, sum1);

    }

}
