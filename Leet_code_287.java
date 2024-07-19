import java.util.Arrays;

public class Leet_code_287 {
    public static void main(String[] args) {
        int [] arr={3,1,3,4,2};
        cyclic_sort(arr);
        int z =duplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(z);
    }
   
    static int duplicate(int []nums){
        for(int i=0; i<nums.length;i++){
            if(i!=nums[i]-1){
                return nums[i]; 
            }
         }
         return nums.length;
    }
    static void cyclic_sort(int [ ] nums){
        int i = 0;
      while (i < nums.length) {
          int correct_index = nums[i] - 1;
          if (nums[i] != nums[correct_index]) {
              int temp = nums[i];
              nums[i] = nums[correct_index];
              nums[correct_index] = temp;
          } else {
              i++;
          }
      }

  }
}
