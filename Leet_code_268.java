import java.util.Arrays;

public class Leet_code_268{
    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
        cyclic_sort(nums);
        int z= to_find_missing_no(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(z);

    }
    static void cyclic_sort(int [ ] nums){
        for(int i=0;i<nums.length;i++){
            int correct_index=nums[i];
            if(correct_index<nums.length)
            {
                if (nums[i]!=correct_index){
                    int temp=nums[i];
                    nums[i]=nums[correct_index];
                    nums[correct_index]=temp;
                }
            }else{
                int temp=nums[nums.length-1];
                nums[nums.length-1]=nums[i];
                nums[i]=temp;
            }
        
        }
    }
     static int to_find_missing_no(int []arr){
         for(int i=0; i<arr.length;i++){
            if(i!=arr[i]){
                return i; 
            }
         }
         return arr.length;
    }
}
