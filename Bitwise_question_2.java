public class Bitwise_question_2{
    public static void main(String[] args) {
        System.out.println(bit_op( 9));
    }
    // to check whether a no. its odd or even using bitwise
    static boolean bit_op(int n){
       if((n & 1)==1)
        return true;
       
        return false;

    }
}
