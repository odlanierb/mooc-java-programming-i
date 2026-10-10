/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int observation;
    
    public Bird(String name, String nameLatin){
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addObservation(){
        this.observation++;
    }
    
    @Override
    public String toString(){
        return String.format("%s (%s): %d observations", this.name, this.nameLatin, this.observation);
    }
    
}
