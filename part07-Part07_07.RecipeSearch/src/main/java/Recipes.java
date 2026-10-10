
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class Recipes {
    ArrayList<Recipe> recipes;
    
    public Recipes(){
        recipes = new ArrayList<>();
    }
    
    public String[] addRecipesToString(String archive){
        String recipesString = "";
        try(Scanner scanner = new Scanner(Paths.get(archive))){
            while(scanner.hasNextLine()){
                recipesString += scanner.nextLine() + "\n";
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        String[] recipeParts = recipesString.split("\n\n");
        return recipeParts;
    }
    
    public void addRecipes(String archive){
        String[] recipeString = this.addRecipesToString(archive);
        for (int i = 0; i < recipeString.length; i++) {
            String[] toAdd = recipeString[i].split("\n");
            String name = "";
            int duration = 0;
            String ingredients = "";
            for (int j = 0; j < toAdd.length; j++) {
                if(j == 0){
                    name = toAdd[j];
                }else if(j == 1){
                    duration = Integer.valueOf(toAdd[j]);
                }else{
                    ingredients += toAdd[j] + "\n";
                }               
            }
            recipes.add(new Recipe(name, duration, ingredients));            
        }
    }
    
    public void list(){
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void find(String find){
        for (Recipe recipe : recipes) {
            if(recipe.getName().contains(find)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int find){
        for (Recipe recipe : recipes) {
            if(recipe.getDuration() <= find){
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredients(String find){
        for (Recipe recipe : recipes) {
            if(recipe.containsIgredients(find)){
                System.out.println(recipe);
            }
        }
    }
}
