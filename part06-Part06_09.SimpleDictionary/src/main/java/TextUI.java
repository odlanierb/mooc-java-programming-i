
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
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        String input;
        while (true) {            
            System.out.print("Command: ");
            input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
            break;
        }
            this.options(input);
        }
        
        
    }
    
    public void options(String input){
        String word, translation;
        if(input.equals("add")){
            System.out.print("Word: ");
            word = scanner.nextLine();
            System.out.print("Translation: ");
            translation = scanner.nextLine();
            this.dictionary.add(word, translation);
        }else if(input.equals("search")){
            System.out.println("To be translated: ");
            word = scanner.nextLine();
            translation = dictionary.translate(word);
            if(translation == null){
                System.out.println(String.format("Word %s was not found", word));
            }else{
                System.out.print("Translation: " + translation);
                
            }
        }else{
            System.out.println("Unknown command");
        }
        
    }
    
}
