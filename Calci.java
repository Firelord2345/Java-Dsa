import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        System.out.println("Enter a char:");
        Scanner in = new Scanner(System.in);
        char cha =in.next().charAt(0);
        System.out.println("Enter a number:");
        int a =in.nextInt();
        System.out.println("Enter a no.:");
        int b =in.nextInt();
        if(cha=='+'){
            System.out.println(a+b);

        }
        if(cha=='-'){
            System.out.println(a-b);

        }
        if(cha=='*'){
            System.out.println(a*b);

        }
        if(cha=='/'){
            System.out.println(a/b);

        }


        
    }

}
