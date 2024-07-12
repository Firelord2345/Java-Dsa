import java.util.Scanner;

public class Armsttrong {
    public static void main(String[] args) {
        System.out.println("Enter a three digit no.");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        boolean b= arm(a);
        if(b){
            System.out.println("Its a armstrong");
        }else{
            System.out.println("its not");
        }
        
    }
    static  boolean arm(int i){
        int d=0;
        int original=i;
        while(i!=0){
         int temp=i%10;
        
         d= d+temp*temp*temp;
         i=i/10;
        }
        return d==original;
        
    }
}
