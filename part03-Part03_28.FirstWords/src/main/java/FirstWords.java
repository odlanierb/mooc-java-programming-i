
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chain;
        
        while(true){
            chain = scanner.nextLine();
            if(chain.equals("")){
                break;
            }            
            printFirst(chain);
            
        }
        
        


    }
    public static void printFirst(String chain){
        String[] word = chain.split(" ");
        System.out.println(word[0]);
    }
    
    
}
