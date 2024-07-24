import java.util.Scanner;

public class Stars_Pattern {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        star_pattern( n);
    }
    static void star_pattern(int n){
        for(int row=0;row<n;row++){
            if(row<(n)/2+1){
                for(int col=0;col<=row;col++){
                    System.out.printf("*");
                }
                System.out.println();
                
            }else{
                for(int col=0;col<((n)/2+1)-(row-((n)/2+1))-1;col++){
                    System.out.printf("*");
                }
    
                System.out.println();
                
            }
            
           
        }
        
        
    }
}
