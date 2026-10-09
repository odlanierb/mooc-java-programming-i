/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Container {
    int contains;
    
    public Container(){
        this.contains = 0;
    }
    
    public int contains(){
        return this.contains;
    }
    
    public void add(int amount){
        if(amount < 0){
        }else if((amount + this.contains) > 100){
            this.contains = 100;
        }else{
            this.contains += amount;
        }
    }
    
    public void remove (int amount){
        if(amount < 0){
            
        }else if(this.contains - amount < 0){
            this.contains = 0;
        }else{
            this.contains -= amount;
        }
    }
    
    public void move(Container container, int move){
        if(move < 0){
            return;
        }else if(move > this.contains){
            move = this.contains;
        }
        this.remove(move);
        container.add(move);
    }
    
    @Override
    
    public String toString(){
        return String.format("%d/100", this.contains);
    }
}
