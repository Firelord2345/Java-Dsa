public class Recursion_1{
    public static void main(String[] args) {
        // fibonaci(1,0,1);
        System.out.println(fib(6));
    }
    // static void fibonaci(int n,int a,int b){
    //     int c=b+a;
       
    //     if(n==6){
    //        System.out.println(a);
    //        return;
    //     }
       
    //     a=b;
    //     b=c;
    //     fibonaci(n+1,a,b);


        

    // }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
