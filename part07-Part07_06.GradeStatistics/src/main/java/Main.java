
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics grades = new GradeStatistics();
        TextUI textUI = new TextUI(grades, scanner);
        
        textUI.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
