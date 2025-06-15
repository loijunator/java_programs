import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String email;
    String username;
    String domain;

    //Accept user input
    System.out.print("Enter your email: ");
    email = scanner.nextLine();

    //Verify email
    if(email.isEmpty()){
      System.out.println("Email cannot be empty");
    }else if(email.contains("@")) {
      if(email.contains(".com")){
        System.out.println("Valid email address");
      }else{
        System.out.println("Invalid domain");
      }
    }else{
      System.out.println("Invalid email address");
    }

    //slice the string
    username = email.substring(0, email.indexOf("@"));
    domain = email.substring(email.indexOf("@") + 1);

    //output 
    System.out.printf("Your username is %s\nYour domain is %s\n", username, domain);
    scanner.close();
  }
}
