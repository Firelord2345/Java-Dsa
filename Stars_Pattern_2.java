import java.util.Scanner;

public class Stars_Pattern_2 {
     public static void main(String[] args) {
        star_pattern();
    }
    static void star_pattern(){
       
        for(int row=0;row<9;row++){
            
            if(row<5){
                    int i=4-row-1;
                    while(i>=0){
                        System.out.print(" ");
                        i--;
                    }
                for(int col=0;col<=row;col++){      
                    System.out.printf("* ");
                    
                }
                System.out.println();
                
            }else{
                int i=row-4-1;
                    while(i>=0){
                        System.out.print(" ");
                        i--;
                    }
                for(int col=0;col<5-(row-5)-1;col++){
                    System.out.printf("* ");
                }
    
                System.out.println();
                
            }
            
           
        }
        
        
    }
}
