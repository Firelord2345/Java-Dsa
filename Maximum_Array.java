public class Maximum_Array {
    public static void main(String[] args) {
        int [][] arr={{1,4,5,7},
                      {2,3,8},
                      {10,11,12} };
        int z=max(arr);
        System.out.println(z);
    }
    static int max(int [][]arr){
     int max= Integer.MIN_VALUE;
    //  for(int i=0;i<arr.length;i++){
    //     if(arr[i]>max){
    //        max=arr[i];
    //     }
    //  }
       for(int i=0;i<arr.length;i++){
          for(int j=0; j<arr[i].length;j++){
             if(arr[i][j]>max){
                max=arr[i][j];
             }
          }
       }

     return max;
      
    }
}
