public class Star_Pattern_4 {
    public static void main(String[] args) {
        star_pattern();
    }
    static void  star_pattern(){
        for(int row=0;row<=6;row++){
            for(int col=0;col<=6;col++){
                   System.out.print(4-(Math.min(Math.min(row,col),Math.min(6-row,6-col)))+" ");
                    
                }
                
            System.out.println();
                
            }
                    
                
                
            
        }
    }


