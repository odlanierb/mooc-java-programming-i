
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = 0;
        
        while(true){
            String chain = scanner.nextLine();
            if(chain.equals("")){
                break;
            }
            String[] words = chain.split(",");
            if(Integer.valueOf(words[1].trim()) > mayor){
                mayor = Integer.valueOf(words[1].trim());
            }
        }
        System.out.println("Age of the oldest: " + mayor);


    }
}
