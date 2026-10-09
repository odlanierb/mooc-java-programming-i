
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberString = 0;
        
        while (true) {            
            String chain;            
            chain = scanner.nextLine();
            if(chain.equals("end")){
                break;
            }
            numberString++;
        }
        System.out.println(numberString);

    }
}
