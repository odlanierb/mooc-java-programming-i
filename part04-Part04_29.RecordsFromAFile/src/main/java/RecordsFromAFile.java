
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "";
        
        System.out.println("Name of the file:");
        file = scanner.nextLine();
        try (Scanner scannerArchive = new Scanner(Paths.get(file))){
            
            
            while (scannerArchive.hasNextLine()) {
                String next = scannerArchive.nextLine();
                String[] line = next.split(",");
                
                if(line[1] == "1"){
                    System.out.println(line[0] + ", age: " + line[1] + " year");
                }else{
                    System.out.println(line[0] + ", age: " + line[1] + " years");
                }
                
                
                
            }
            
        } catch (Exception e) {
        }
    }
}
