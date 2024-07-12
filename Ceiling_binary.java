public class Ceiling_binary {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=10;
        int z=ceiling(arr,target);
        System.out.println(z);
    }
    static int ceiling(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(target==arr[mid]||target+1==arr[mid]){
        //         return arr[mid];
        //     }
        //     if(target>arr[mid]){
        //         start=mid+1;
        //     }else{
        //         end=mid-1;
        //     }
        // }
        // return -1; this solution not works for no. greater than target for not more than one
        
        if(target>arr[end]){
            return -1;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return arr[start];
    }
}
