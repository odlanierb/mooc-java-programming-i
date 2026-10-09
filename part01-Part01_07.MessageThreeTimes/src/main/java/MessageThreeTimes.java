
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";

        System.out.println("Write a message:");
        // Write your program here
        word = scanner.nextLine();
        
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);

    }
}
