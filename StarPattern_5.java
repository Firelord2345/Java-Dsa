public class StarPattern_5 {
    public static void main(String[] args) {
        int n = 3; // Number of rows

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if(i==0 && j%2==0)
               {
                System.out.print("*"+"     "+"*");
               }
               if(i==1 && j%2==0)
               {
                System.out.print("*"+"  "+"*" +" ");
               }
               if(i==2 && j%4==0)
               {
                System.out.print("*"+"    ");
               
               }
               if(i==2 && j==4){
                System.out.print("*"+"    "); 
               }
            }
            System.out.println();
        
        }
    }
}

