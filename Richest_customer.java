public class Richest_customer{
    public static void main(String[] args) {
        int [][] accounts={{2,8,7},{7,1,3},{1,9,5}};
       int z= richest(accounts);
       System.out.println(z);
        

    }
    static int richest(int[][]accounts) {
        int max=0;
        
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
                
            }
            
        }
        
        return max;
    }
}
