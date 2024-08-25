public class String_example{
    public static void main(String[] args){
        String S="malayalam";
        System.out.println(palidrome(S));
    }
    static String palidrome(String S){
        StringBuilder palidrome=new  StringBuilder(S.toLowerCase());
        if(palidrome.toString().equals(palidrome.reverse().toString())){
            return "true";
        }
        return "false";
    }
}
