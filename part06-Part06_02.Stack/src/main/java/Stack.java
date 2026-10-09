
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Stack {
    
    private ArrayList<String> chain;
    
    public Stack(){
        this.chain = new ArrayList<>();
        
    }
    
    public boolean isEmpty(){
        return chain.isEmpty();
    }
    
    public void add(String chain){
        this.chain.add(chain);
    }
    
    public ArrayList<String> values(){
        return this.chain;
    }
    
    public String take(){        
        return this.chain.remove(this.chain.size() - 1);
    }
    
    
}
