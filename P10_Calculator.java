import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Calculator program that takes user input of 2 numbers
    //It performs +,-,*,/

    //Declaring variables
    double num1;
    double num2;
    double sum;
    double difference;
    double product;
    double dividend;
    String option;

    System.out.println("Welcome to Calculator Program !!!");
    System.out.print("Please enter which operation to perform ( + - * / ): ");
    option = scanner.nextLine();

    //accepting numbers 
    System.out.print("Enter number 1: ");
    num1 = scanner.nextDouble();
    System.out.print("Enter number 2: ");
    num2 = scanner.nextDouble();

    //Mathematics
    sum = num1 + num2;
    difference = num1 - num2;
    product = num1 * num2;
    dividend = num1 / num2;

    //switch statement to return output according to selected option 
    switch(option){
      case "+" -> System.out.printf("Sum of the two numbers = %.2f\n", sum);
      case "-" -> System.out.printf("Difference between the two numbers = %.2f\n", difference);
      case "*" -> System.out.printf("Product of the two numbers = %.2f\n", product);
      case "/" -> System.out.printf("Dividend of the two numbers = %.3f\n", dividend);
      default -> System.out.println("Invalid Option Entered");
    }
    scanner.close();
  }
}
