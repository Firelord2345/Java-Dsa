public class Star_Pattern_3 {
    public static void main(String[] args) {
        star_pattern();
    }
    static void star_pattern(){
          for(int row=1;row<=5;row++){
            int i=4-row;
            while(i>=0){
                System.out.print("  ");
                i--;
            }
            for(int k=row;k>1;k--){
                
                System.out.print(k+" ");

                
             }
             for(int col=1;col<=row;col++){
               
                System.out.print(col+" ");
               
             } 
             
             System.out.println();
          }
    }
}
