import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in =new Scanner(System.in);
        int a= in.nextInt();
        int temp;
        int c=0;
        while(a>0){
            temp=a%10;
            c=10*c+temp;
            a=a/10;


            

        }
        System.out.println(c);

    }
    
}
