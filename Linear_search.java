public class Linear_search {
    public static void main(String[] args) {
        int []arr={12,234,245,56,67};
        int z=linear(arr,245);
        System.out.println(z);
    }
    static int linear(int []arr,int target){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==target){
                return arr[i];// this can be replaced wit element or true falsedepending of the question
            }
        }
         return -1;
    }
    
}
