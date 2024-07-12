import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // Create 2D ArrayList and populate it with user input
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // Print the 2D ArrayList
        System.out.println(list);
        in.close();

        
    }
}
