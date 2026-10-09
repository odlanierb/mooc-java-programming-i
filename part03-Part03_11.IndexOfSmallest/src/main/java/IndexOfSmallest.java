
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999){
                break;
            }
            list.add(number);
        }
        
        smallets(list);
        
    }
    
    public static void smallets(ArrayList<Integer> list){
        int smaller = list.get(0);
        for (int integer : list) {
            if(smaller > integer){
                smaller = integer;
            }
        }
        System.out.println("Smallest number: " + smaller);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == smaller){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
