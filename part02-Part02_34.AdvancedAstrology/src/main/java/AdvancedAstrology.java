
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print(" ");
            i++;
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size - 1;
        for (int i = 0; i < size; i++) {
            printSpaces(spaces);
            spaces--;
            printStars(i+1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height - 1;
        int printStar = 1;
        for (int i = 0; i < height; i++) {
            printSpaces(spaces);
            spaces--;
            printStars(printStar);
            printStar = printStar + 2;
        }
        spaces = (printStar - 5) / 2;
        
        for (int i = 0; i < 2; i++) {
            printSpaces(spaces);
            printStars(3);
        }

        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
