
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();
        String archive = "";
        String comand = "";
        
        
        System.out.print("File to read: ");
        archive = scanner.nextLine();
        recipes.addRecipes(archive);
        
        System.out.println("");
        
        System.out.println("Commands:\n" +
                           "list - lists the recipes\n" +
                           "stop - stops the program\n" +
                           "find name - searches recipes by name\n" +
                           "find cooking time - searches recipes by cooking time\n" +
                           "find ingredient - searches recipes by ingredient\n");
        
        while (true) {            
            System.out.print("Enter command: ");
            comand = scanner.nextLine();
         
            if(comand.equals("list")){
                System.out.println("\nRecipes:");
                recipes.list();
            }else if(comand.equals("stop")){
                break;
            }else if(comand.contentEquals("find name")){
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipes.find(name);
            }else if(comand.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int cook = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                recipes.findCookingTime(cook);
            }else if(comand.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String find = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipes.findIngredients(find);
            }
        }
         

    }

}
