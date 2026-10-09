/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Items {
    private String identifier;
    private String name;
    
    public Items(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Items)){
            return false;
        }
        
        Items itemCompared = (Items) compared;
        
        return this.identifier.equals(itemCompared.identifier);
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
