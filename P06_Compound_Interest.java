import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //setting variables
    //CI formula: A = P(1 + r/n)^nt
    //Amount = Principal * (1 + interestRate/timeCompounded)^(timesCompounded*years)
    double amount;
    double rate;
    double principal;
    int timesCompounded;
    int years;
    
    //Accepting user input:
    System.out.print("Enter Principal Amount: ");
    principal = scanner.nextDouble();
    System.out.print("Enter rate of interest rate (in %): ");
    rate = scanner.nextDouble() / 100;
    System.out.print("Enter time duration in years: ");
    years = scanner.nextInt();
    System.out.print("Enter number of times compounded per year: ");
    timesCompounded = scanner.nextInt();

    //Applying formula
    amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded*years);
    System.out.printf("The amount after %d years is $%,.2f\n", years, amount);
    scanner.close();
  }
}
