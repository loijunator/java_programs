import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Scanner declaration
    Scanner scanner = new Scanner(System.in);
    
    //String Input
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    // String name = scanner.next(); outputs only first word
    
    //Integer input
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    
    //Double Input
    System.out.print("Enter your GPA: ");
    double gpa = scanner.nextDouble();

    //Boolean Input 
    System.out.print("Are you a student? (true/false)");
    Boolean isStudent = scanner.nextBoolean();

    //Output Section
    System.out.println("Your name is " + name);
    System.out.println("You are " + age + " years old");
    System.out.println("Your GPA is " + gpa);
    // System.out.println("Student: " + isStudent); too basic
    // Using if 
    if (isStudent) {
      System.out.println("You are a student");
    } else {
      System.out.println("You are not a student");
    }

    // If you encounter problem where user input takes previous input, it is because of new line character.
    // To correct this error, add :
    // scanner.nextLine() after accepting previous integer input which was causing the error.
    
    scanner.close(); //not closing can lead to unexpected behaviour
  }
}
