public class Bitwise_questions_7 {
    public static void main(String[] args) {
        System.out.println(bit_op(1));
    }
    static int  bit_op(int a){
         int result=0;
        for(int i=0;i<16;i++){
            int s=0;
            s=(int)(((a>>i)&1)*Math.pow(5,i+1));
            result+=s;
        }
        return result;
    }
}
