
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String chain = scanner.nextLine();
            if(chain.equals("")){
                break;
            }
            containsAv(chain);
        }


    }
    
    public static void containsAv(String chain){
        String[] words = chain.split(" ");
        for (String word : words) {
            if(word.contains("av")){
                System.out.println(word);
            }
        }
    }
}
