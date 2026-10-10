
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class TextUI {
    private Scanner scanner;
    private Birds birds;
    
    public TextUI(Scanner scanner, Birds birds){
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start(){
        String option = "";
        
        while (true) {            
            System.out.print("?");
            option = scanner.nextLine();
        
            if(option.equals("Add")){
                String name = "";
                String latinName = ""; 
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                latinName = scanner.nextLine();
                birds.add(new Bird(name, latinName));
            }else if(option.equals("Observation")){
                String name = "";
                System.out.print("Bird? ");
                name = scanner.nextLine();
                birds.observation(name);
            }else if(option.equals("All")){
                birds.all();
            }else if(option.equals("One")){
                String name = "";
                System.out.print("Bird? ");
                name = scanner.nextLine();
                birds.one(name);
            }else if(option.equals("Quit")){
                break;
            }
        }
        
        
    }
}
