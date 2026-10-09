
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int result = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            numberOfNumbers++;
            result = result + number;
        }
        
        System.out.println("Average of the numbers: " + (double) result/numberOfNumbers);

    }
}
