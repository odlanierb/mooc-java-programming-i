/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Gauge {
    private int value;
    
    public Gauge(){
        value = 0;
    }
    
    public boolean full(){
        return this.value >= 5;
    }
    
    public void increase(){
        if (!full()){
            this.value++;
        }
    }
    public void decrease(){
        if(this.value > 0){
            this.value--;
        }
    }
    
    public int value(){
        return this.value;
    }
}
