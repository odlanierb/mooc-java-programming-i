
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOldest = "";
        int ageOldest = 0;
        boolean noName = true;
        
        while(true){
            String chain = scanner.nextLine();
            if(chain.equals("")){
                break;
            }
            String[] name = chain.split(",");
            if(noName){
                nameOldest = name[0];
                ageOldest = Integer.valueOf(name[1]);
                noName = false;
            }
            if(ageOldest < Integer.valueOf(name[1])){
                nameOldest = name[0];
                ageOldest = Integer.valueOf(name[1]);
            }
            
            
            
        }
        
        System.out.println("Name of the oldest: " + nameOldest);


    }
}
