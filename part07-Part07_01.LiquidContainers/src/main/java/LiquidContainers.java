
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;


        while (true) {
            System.out.println(String.format("First: %d/100", container1));
            System.out.println(String.format("Second: %d/100", container2));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] option = input.split(" ");
            if(option[0].equals("add")){
                if(Integer.valueOf(option[1]) < 0){
                    continue;
                }
                container1 += Integer.valueOf(option[1]);
                if(container1 > 100){
                    container1 = 100;
                }
            }else if(option[0].equals("move")){
                if(Integer.valueOf(option[1]) < 0){
                    continue;
                }
                if(container1 < Integer.valueOf(option[1])){
                    System.out.println("entro");
                    container2 += container1;
                    container1 = 0;
                    if(container2 > 100){
                        container2 = 100;                        
                    }
                    continue;
                }
                container1 -= Integer.valueOf(option[1]);
                container2 += Integer.valueOf(option[1]);
                if(container1 < 0){
                    container1 = 0;
                }
                if(container2 > 100){
                    container2 = 100;
                }
            }else if(option[0].equals("remove")){
                container2 -= Integer.valueOf(option[1]);
                if(container2 < 0){
                    container2 = 0;
                }
            }

        }
    }

}
