public class Bineary_search {
    public static void main(String[] args) {
        int []arr={10,9,8,7,6};
        int target=7;
       int z= bineary(arr,target);
       System.out.println(z);
    }
    static int bineary(int[]arr,int target){
             int start=0;
             int end=arr.length-1;


             boolean isAsc= arr[start]<arr[end];
             
             while(start<=end){
                int mid= start+(end-start)/2;
                
                if (target== arr[mid]){
                    return arr[mid];
                 }
                 if (isAsc){
                    if(target>arr[mid]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                 }else{
                    if(target<arr[mid]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                 }
                
             }
            
        return -1;
    }
    
}
