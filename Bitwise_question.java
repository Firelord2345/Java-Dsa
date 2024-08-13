public class Bitwise_question {
    public static void main(String[] args) {
        int []a={1,1,2,2,3,3,4,4,5};
          System.out.println(bit_op(a));
    }
    static int bit_op(int [ ]a){
        int arr=0;
        for(int num : a){
            
            arr=arr^num;
        }
        return arr;
    }
    
}
