
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
public class Room {
    ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        Person shortest = null;
        if(this.persons.isEmpty()){
            return null;
        }
        for (Person person : persons) {
            if(shortest == null){
                shortest = person;
            }
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
        Person taken;
        taken = shortest();
        for (int i = 0; i < persons.size(); i++) {
            if(taken.equals(persons.get(i))){
                persons.remove(persons.get(i));
            }
        }
        return taken;
    }
    
}
