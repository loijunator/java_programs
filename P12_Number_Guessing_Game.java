import java.util.Scanner;
import java.util.Random;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    //Game to ask user to guess a number and return if guess is correct
    //Numbers will be between 1 and 100
    //
    //Declaring variables
    int min = 1;
    int max = 100;
    int num = 0;
    int guess = 0;
    int attempts = 0;
    
    //generate random number 
    num = random.nextInt(min, max + 1);
    
    //Output to user
    System.out.println("Welcome to number guessing game !!!"); //welcome message
    do{
      System.out.printf("Guess a number between %d-%d ", min, max); //ask user for guess number
      guess = scanner.nextInt();
      attempts++;
      if(guess > num){
        System.out.println("TOO HIGH! Try again.");
      }else if(guess < num){
        System.out.println("TOO LOW! Try again.");
      }else{
        System.out.println("Your guess is CORRECT!!!");
      }
    }while (guess != num);

    //output congratulations after correct guess
    System.out.println("You took " + attempts + " attempts!");
    System.out.println("Congratulations! You have won !!!");
    scanner.close();
  }
}
