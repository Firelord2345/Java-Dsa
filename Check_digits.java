public class Check_digits{
    public static void main(String[] args) {
        int []arr={12,3454,2,6,7890};
        int z=even_digits(arr);
        System.out.println(z);
    }
    static int even_digits(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(no_digits(arr[i])){
                 count++;
            }
        }
        return count;
    }
    static boolean no_digits(int num){
         int count=0;
         int i=0;
         while(num>0){
            num/=10;
            count++;
         }
         if(count%2==0){
            return true;
         }
         return false;

    }

}