
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String identifier, name;
        ArrayList<Items> items = new ArrayList();
        
        
        while (true) {            
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Items item = new Items(identifier, name);
            
            if(items.contains(item)){
                continue;
            }
            items.add(item);           
            
            
        }
        System.out.println("==Items==");
        for (Items item : items) {
            System.out.println(item);
        }


    }
}
