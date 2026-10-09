
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file, team;
        System.out.println("File:");
        file = scan.nextLine();
        System.out.println("Team:");
        team = scan.nextLine();
        
        int[] gameStatisc = teamStatisc(file, team);
        System.out.println("Games: " + gameStatisc[0]);
        System.out.println("Wins: " + gameStatisc[1]);
        System.out.println("Losses: " + gameStatisc[2]);
        

    }
    
    public static int[] teamStatisc(String file, String team){
        int[] gameStatics = new int[3];
        try(Scanner scannerArchive = new Scanner(Paths.get(file))) {
            while (scannerArchive.hasNextLine()) {
                String next = scannerArchive.nextLine();
                if(next.contains(team)){
                    gameStatics[0]++;
                    String[] parts = next.split(",");
                    if(parts[0].equals(team)){
                        if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                            gameStatics[1]++;
                        }else{
                            gameStatics[2]++;
                        }
                    }else if(parts[1].equals(team)){
                        if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                            gameStatics[1]++;
                        }else{
                            gameStatics[2]++;
                        }
                    }
                }
                
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return gameStatics;
    }

}
