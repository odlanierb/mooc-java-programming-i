/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Gift {
    
    private String name;
    private int kg;
    
    public Gift(String name, int kg){
        this.name = name;
        this.kg = kg;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWeight(){
        return kg;
    }
    
    @Override
    
    public String toString(){
        return this.name + "(" + this.kg +" kg)";
    }
    
    
}
