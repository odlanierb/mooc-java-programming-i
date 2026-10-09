
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            String chain = scanner.nextLine();
            int number;
            if(chain.equals("end")){
                break;
            }
            number = Integer.valueOf(chain);
            System.out.println(number * number * number);
        }

    }
}
