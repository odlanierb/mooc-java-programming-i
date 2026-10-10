
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
public class GradeStatistics {
    private ArrayList<Integer> grades;
    
    public GradeStatistics(){
        this.grades = new ArrayList();
    }
    
    public void add(int grade){
        if(grade >= 0 && grade <= 100){
            this.grades.add(grade);
        }
    }
    
    public double pointsAverage(){
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    public double pointsAverageAprove(){
        double sum = 0;
        int how = 0;
        for (Integer grade : grades) {
            if(grade >= 50){
                sum += grade;
                how++;
            }
        }
        if(how == 0){
            return 0;
        }
        return sum / how;
    }
    
    public String pointsAverageAproveToString(){
        if(pointsAverageAprove() < 50){
            return "-";
        }
        return String.valueOf(pointsAverageAprove());
    }
    
    public double aprovePercentage(){
        int aprove = 0;
        for (Integer grade : grades) {
            if(grade >= 50){
                aprove++;
            }
        }
        return (double) 100 * aprove / grades.size();
    }
    
    public void printStars(){
        int[] grades = new int[6];
        for (Integer grade : this.grades) {
            if(grade < 50){
                grades[0]++;
            }else if(grade < 60){
                grades[1]++;
            }else if(grade < 70){
                grades[2]++;
            }else if(grade < 80){
                grades[3]++;
            }else if(grade < 90){
                grades[4]++;
            }else if(grade <= 100){
                grades[5]++;
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + "*".repeat(grades[5]));
        System.out.println("4: " + "*".repeat(grades[4]));
        System.out.println("3: " + "*".repeat(grades[3]));
        System.out.println("2: " + "*".repeat(grades[2]));
        System.out.println("1: " + "*".repeat(grades[1]));
        System.out.println("0: " + "*".repeat(grades[0]));
    }
    
}
