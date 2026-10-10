/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Recipe {
    private String name;
    private int duration;
    private String ingredients;
    
    public Recipe(String name, int duration, String ingredients){
        this.name = name;
        this.duration = duration;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDuration(){
        return duration;
    }
    
    public String getIngredients(){
        return ingredients;
    }
    
    public boolean containsIgredients(String find){
        String[] ingredientsParts = this.ingredients.split("\n");
        
        for (String ingredientsPart : ingredientsParts) {
            if(ingredientsPart.equals(find)){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("%s, cooking time: %d", this.name, this.duration);
    }
    
}
