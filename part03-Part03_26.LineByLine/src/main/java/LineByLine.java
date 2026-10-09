
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        exercise();


    }
    public static void exercise(){
        Scanner scanner = new Scanner(System.in);
        String chain;
        while(true){
            chain = scanner.nextLine();
            if(chain.equals("")){
                return;
            }
            String[] split = chain.split(" ");
            
            for (String string : split) {
                System.out.println(string);
            }
        }
    }
}
