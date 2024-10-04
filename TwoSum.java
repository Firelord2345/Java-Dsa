import java.util.*;
public class TwoSum {
    public static int[] twoSum(int [] nums, int target){
        HashMap <Integer,Integer>number=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(number.containsKey(complement)){
                return new int[]{number.get(complement),i};
            }
            number.put(nums[i],i);
        }
            throw new IllegalArgumentException("No two sum solution");
        }
    
    public static void main(String[] args) {
        int target=9;
        int [] arr ={2,7,11,15};
        int [] result=twoSum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
