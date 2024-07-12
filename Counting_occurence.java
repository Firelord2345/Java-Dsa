import java.util.Scanner;

public class Counting_occurence{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no.");
        int a=in.nextInt();
        System.out.println("enter the digit");
        int b= in.nextInt();
        int d=occurence(a,b);
        System.out.println(d);
        
      

    }
    static int occurence(int a, int b){
      int c=0;
      while(a>0){
        if(a%10==b){
          c++;
          
        }
        a=a/10;
      }
      return c;

    }
}
