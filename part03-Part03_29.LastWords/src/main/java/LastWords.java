
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String chain = scanner.nextLine();
            if(chain.equals("")){
                break;
            }
            printLast(chain);
        }


    }
    
    public static void printLast(String chain){
        String[] word = chain.split(" ");
        System.out.println(word[word.length - 1]);
    }
    
    
}
