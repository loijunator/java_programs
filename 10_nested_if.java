import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //nested if is when there is an if statement within another if statement
    // it can even include else-if and else statements
    boolean isStudent = false;
    boolean isSenior = true;
    double price = 50;

    if(isStudent) {
      if(isSenior){
        System.out.println("You get a senior discount of 20% and student discount of 10% !!!");
        price *= 0.7; 
      }else{
        System.out.println("You get a student discout of 10% !!!");
        price *= 0.9;
      }
    }else{
      if(isSenior){
        System.out.println("You get a senior discount of 20%");
        price *= 0.8;
      }
      else{
      price *= 1;
      }
    }
    System.out.printf("The price of the ticket is $%.2f\n", price);
    scanner.close(); 
  }
}
