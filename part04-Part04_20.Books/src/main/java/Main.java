import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String option;
        
        while(true){
            String title;
            int pages, year;
            
            System.out.println("Title: ");
            title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
            
        }
        System.out.println("");
        
        System.out.println("What information will be printed? ");
        option = scanner.nextLine();
        
        if (option.equals("everything")){
            for (Object book : books) {
                System.out.println(book);
            }
        }else if(option.equals("name")){
            for (Book book : books) {
                System.out.println(book.getName());
            }
        }

    }
}
