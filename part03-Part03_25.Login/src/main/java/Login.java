
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        System.out.print("Enter username: ");        
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        printLogin(username, password);
        
        

    }
    
    public static boolean userPassExist(String username, String password){
        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        for (int i = 0; i < users.length; i++) {
            if(username.equals(users[i]) && password.equals(passwords[i])){
                return true;
            }
        }
        return false;
    }
    
    public static void printLogin(String username, String password){
        boolean f = userPassExist(username, password);
        if(f){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
