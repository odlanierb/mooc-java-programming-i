
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
public class Birds {
    private ArrayList<Bird> birds;
    
    public Birds(){
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        birds.add(bird);
        
    }
    
    public void observation(String name){
        for (Bird bird : birds) {
            if(bird.getName().equals(name)){
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void one(String name){
        for (Bird bird : birds) {
            if(bird.getName().equals(name)){
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void all(){
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    
    
    
}
