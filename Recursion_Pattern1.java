public class Recursion_Pattern1 {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    // static void triangle(int r,int c){
    //     if(r==0){
    //         return;
    //     }
    //     if(r>c){
    //         System.out.print("*");
    //         triangle(r, c+1);
    //     }
    //     else{
    //         System.out.println();
    //         triangle(r-1,c=0);
    //     }
    // }
    static void triangle2(int r, int c) {
        if (r == 0) {
            return;  // Base case: stop recursion when rows are 0
        }
        if (c < r) {  
            triangle2(r, c + 1);  // Recursive call for the same row
            System.out.print("*");  // Print star after the recursive call
        } else {
            
            triangle2(r - 1, 0);  // Move to the next row, reset columns
            System.out.println(); 
        }
    }
}
  