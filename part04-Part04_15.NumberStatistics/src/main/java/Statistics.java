
public class Statistics {
    private int numberAdd;
    private int sum;
    
    public Statistics(){
        this.numberAdd = 0;
        this.sum = 0;
        
    }
    
    public int getCount(){
        return this.numberAdd;        
    }
    
    public int sum(){
        return sum;
    }
    
    public void addNumber(int number){
        this.numberAdd++;
        this.sum = sum + number;
    }
    
    public double average(){
        if(this.numberAdd == 0){
            return 0;
        }else{
            return (double) this.sum / this.numberAdd;
        }
        
    }
}
