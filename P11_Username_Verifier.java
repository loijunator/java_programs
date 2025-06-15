import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //username must be between 4-12 characters
    //must not contain whitespace or underscore
    //declare variables
    String username;
    
    //accept user input
    System.out.print("Create your username: ");
    username = scanner.nextLine();
    
    //verifying logic
    if(username.length()>12 || username.length()<4){
      System.out.println("Username length is invalid, must be between 4 and 12 characters");
    }else if(username.contains(" ") || username.contains("_")){
      System.out.println("Username cannot contain whitespace or underscore");
    }else{
      System.out.println("Your username has been successfully created: " + username);
    }
    scanner.close();
  }
}
