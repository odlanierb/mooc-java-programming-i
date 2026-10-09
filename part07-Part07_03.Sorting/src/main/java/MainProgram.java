
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    
    public static int smallest(int[] array){
        int smallets = array[0];
        for (int i : array) {
            if(smallets > i){
                smallets = i;
            }
        }        
        return smallets;                
    }
    
    public static int indexOfSmallest(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == smallest(array)){
                return i;
            }
        }
        return 0;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallestFrom = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if(smallestFrom > table[i]){
                smallestFrom = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
    if(index1 == index2){
        return;
    }
    int aux = array[index1];
    array[index1] = array[index2];
    array[index2] = aux;    
    }
    
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(indexOfSmallestFrom(array, i) == i){
                System.out.println(Arrays.toString(array));
            }else{
                swap(array, i, indexOfSmallestFrom(array, i));
                System.out.println(Arrays.toString(array));
            }
        }
    }

}
