
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        System.out.println("The greatest number: " + greatest(list));
    }
    
    public static int greatest(ArrayList<Integer> list){
        int great = list.get(0);
        for (Integer integer : list) {
            if(integer > great){
                great = integer;
            }
        }
        return great;
    }
}
