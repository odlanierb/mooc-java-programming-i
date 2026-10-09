
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();


        while (true) {
            System.out.println("First " + container1);
            System.out.println("Second " + container2);

            String input = scan.nextLine();
             String[] separated = input.split(" ");
            if (separated[0].equals("quit")) {
                break;
            }else if(separated[0].equals("add")){
                container1.add(Integer.valueOf(separated[1]));
            }else if(separated[0].equals("move")){
                container1.move(container2, Integer.valueOf(separated[1]));
            }else if(separated[0].equals("remove")){
                container2.remove(Integer.valueOf(separated[1]));
            }

        }
    }

}
