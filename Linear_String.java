import java.util.Arrays;

public class Linear_String{
    public static void main(String[] args) {
        String name="joel";
        char z=linear(name,'u');
        System.out.println(z);
        
    }
    static char linear(String str,char target){
        for(char c:str.toCharArray()){
            if(c==target){
                return c;
            }
        }
        
        return 'f';
    }

}