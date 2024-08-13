public class Bitwise_questions_5 {
    public static void main(String[] args) {
        System.out.println( bit_op(364));
    }
    static int bit_op(int n){
        
        for(int i=0; i<16;i++){
            int k=1<<i;
            
            if((n&k)!=0){
            return i+1; 
        }
        }
        return 0;
    }
}
