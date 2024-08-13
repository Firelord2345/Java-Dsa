public class Bitwise_questions_6 {
    public static void main(String[] args) {
        int []a={2,2,2,3,7,7,7,8,8,8};
        System.out.println( bit_op(a));
    }
    static int  bit_op(int []a){
        int result=0;
        for(int j=0;j<16;j++){
            int sum=0;
            for(int i=0; i<a.length;i++){
                sum+=(a[i]>>j)&1;   
            }
            sum=sum%3;
            result|=(sum<<j);
        }
        return result;
    }
}
