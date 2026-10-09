
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
public class Suitcase {
    private ArrayList<Item> suitcase;
    private int weightMax;
    
    public Suitcase(int max){
        this.suitcase = new ArrayList<>();
        this.weightMax = max;
    }
    
    public int getSuitCaseWeight(){
        int weight = 0;
        for (Item item : suitcase) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public void addItem(Item item){
        if(this.getSuitCaseWeight() + item.getWeight() <= weightMax){
            suitcase.add(item);
        }
        
    }
    
    public void printItems(){
        for (Item item : suitcase) {
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        return getSuitCaseWeight();
    }
    
    public Item heaviestItem(){
        if(suitcase.isEmpty()){
            return null;
        }
        Item heaviest = null;
        for (Item item : suitcase) {
            if(heaviest == null){
                heaviest = item;
            }else if(heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public String toString(){
        if(this.suitcase.isEmpty()){
            return String.format("no items (%d kg)", this.getSuitCaseWeight());
        }else if(this.suitcase.size() == 1){
            return String.format("%d item (%d kg)", this.suitcase.size(), this.getSuitCaseWeight());
        }else{
            return String.format("%d items (%d kg)", this.suitcase.size(), this.getSuitCaseWeight());
        }
        
    }
    
    
}
