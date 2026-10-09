
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        if(elements.isEmpty()){
            return String.format("The collection %s is empty.", this.name);
        }else if(elements.size() == 1){
            String elementString = "";
            for (String element : elements) {
                elementString += element +"";
            }
            return String.format("The collection %s has 1 element:\n", this.name) + elementString;
        }else{
            String elementString = "";
            for (String element : elements) {
                elementString += element +"\n";
            }
            return String.format("The collection %s has %d elements:\n", this.name, elements.size()) + elementString;
        }
    }
    
}
