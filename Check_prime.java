import java.util.Scanner;
public class Check_prime {
    public static void main(String[]args){
        System.out.println("Enter a  prime no.:");
        Scanner in= new Scanner(System.in);
        int a =in.nextInt();
        if(a<=1){
           System.out.println("its not a prime no.");
           return;
        }
        if(a<=3){
            System.out.println("its  a prime no.");
            return;
        }
        if(a % 2==0 || a % 3==0  ){
            System.out.println("its not a prime 3no.");
            return;
        }
        for(int i=5; i*i<=a;i+=6){
            if(a% i==0||a% i+2==0){
                System.out.println("its not a prime no.");
            }else{
                System.out.println("its  a prime no.");
            }
        }

        

    }
}
