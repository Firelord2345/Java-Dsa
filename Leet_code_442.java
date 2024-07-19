import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_code_442 {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        cyclic_sort(arr);
        List<Integer> z =duplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(z);
    }
   
    static List<Integer>duplicate(int []nums){
        List<Integer>list=new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(i!=nums[i]-1){
                list.add(nums[i]); 
            }
         }
         return list;
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

