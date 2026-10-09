import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int maxDuration;
        
        while (true) {            
            String name;
            int duration;
            
            System.out.print("Name: ");
            name = scanner.nextLine();
            if(name.isEmpty()) break;
            System.out.print("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program : programs) {
            if(program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }

    }
}
