public class Ceiling_alpha {
    public static void main(String[] args) {
        char[] arr={'a','b','c','d'};
        char target='e';
        char z=ceiling(arr,target);
        System.out.println(z);
    }
    static char  ceiling(char[]arr,char target){
        int start=0;
        int end= arr.length-1;
    // if(target>=arr[end]){
    //     return arr[0];
    // }
    while(start<=end){
        int mid=start+(end-start)/2;
        
        if(target>arr[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    
    return arr[start%arr.length];

}
}
