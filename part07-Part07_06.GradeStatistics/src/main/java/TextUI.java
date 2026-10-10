
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class TextUI {
    private GradeStatistics grades;
    private Scanner scanner;
    
    public TextUI(GradeStatistics grades, Scanner scanner){
      this.grades = grades;
      this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true) {            
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1){
                break;
            }
            grades.add(point);
        }
        System.out.println("Point average (all): " + grades.pointsAverage());   
        System.out.println("Point average (passing): " + grades.pointsAverageAproveToString());       
        System.out.println("Pass percentage: " + grades.aprovePercentage());
        grades.printStars();
    }
    
}
