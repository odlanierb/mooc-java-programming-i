
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
public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int getHoldWeight(){
        int weight = 0;
        for (Suitcase suitcase : hold) {
            weight += suitcase.getSuitCaseWeight();
        }
        return weight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.getHoldWeight() + suitcase.getSuitCaseWeight() <= maxWeight){
            hold.add(suitcase);
        }
        
    }
    
    public void printItems(){
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString(){
        if(this.hold.isEmpty()){
            return String.format("no suitcases (%d kg)", this.getHoldWeight());
        }else if(this.hold.size() == 1){
            return String.format("%d suitcase (%d kg)", this.hold.size(), this.getHoldWeight());
        }else{
            return String.format("%d suitcases (%d kg)", this.hold.size(), this.getHoldWeight());
        }
    }
    
}
