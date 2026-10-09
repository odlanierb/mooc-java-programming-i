
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumYears = 0;
        int chainsText = 0;
        String longName = "";
        
        while(true){
            String chain = scanner.nextLine();
            if(chain.equals("")){
                break;
            }
            String[] words = chain.split(",");
            sumYears += Integer.valueOf(words[1]);
            chainsText++;
            if(longName.length() < words[0].length()){
                longName = words[0];
            }
            
        }
        
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + ((double)sumYears/chainsText));


    }
}
