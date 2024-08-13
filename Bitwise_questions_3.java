public class Bitwise_questions_3 {
    public static void main(String[] args) {

       System.out.println( bit_op(10,1));
    }
    static int bit_op(int n,int i){
        int k=1<<i-1;
        if((n&k)!=0){
            return 1;
        }
        return 0;
    }
    
}
