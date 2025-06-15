import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Enhanced switches improve on standard switches
    //Alternative to using multiple if-else statements
    //declare variable
    String day;
    System.out.print("Enter the day of the week: ");
    day = scanner.nextLine();

    //switch statement 
    switch(day){
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
      case "Saturday", "Sunday" -> System.out.println("It is the weekend !!!");
      default -> System.out.println("Invalid day entered");
    }
    
    scanner.close();
  }
}
