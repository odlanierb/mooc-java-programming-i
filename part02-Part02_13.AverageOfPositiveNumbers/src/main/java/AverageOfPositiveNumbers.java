
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPositive = 0;
        int numPositive = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            if(number > 0){
                sumPositive = sumPositive + number;
                numPositive++;
            }
            
        }
        
        if(numPositive == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println((double) sumPositive / numPositive);
        }

    }
}
