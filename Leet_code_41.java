import java.util.Arrays;

public class Leet_code_41{
    public static void main(String[] args) {
        int [] nums={3,4,-1,1};
        cyclic_sort(nums);
        System.out.println(Arrays.toString(nums));
        int z=to_find_missing_positive(nums);
        System.out.println(z);
        
        }
        
    
    static void cyclic_sort(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]>0){
                if (nums[i] < nums.length && nums[i]!=nums[nums[i]-1] ) {
                    int correct_index = nums[i]-1;
                    int temp = nums[i];
                    nums[i] = nums[correct_index];
                    nums[correct_index] = temp;
                } else {
                    i++;
                }
            }else{
                i++;
            }
           
            
        }
    }
    static int to_find_missing_positive(int [] nums){
        for(int i=0; i<nums.length;i++){
            if(i!=nums[i]-1){
                return i+1; 
            }
         }
         return nums.length+1;
    }
    

    
}
