
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
public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner){
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start(){
        String input;
        while (true) {            
            System.out.print("Command: ");
            input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            this.option(input);
        }
    }
    
    public void option(String input){
        String word;
        if(input.equals("add")){
            System.out.print("To add: ");
            word = scanner.nextLine();
            todolist.add(word);
        }else if(input.equals("list")){
            todolist.print();
        }else if(input.equals("remove")){
            System.out.print("Which one is removed? ");
            int remove = Integer.valueOf(scanner.nextLine());
            todolist.remove(remove);
        }
    }
}
