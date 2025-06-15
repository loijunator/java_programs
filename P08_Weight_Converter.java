import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Weight conversion program:
    //convert lbs to kgs
    //convert kgs to lbs
    //select an option
    
    //declare variables
    double weight;
    int option;
    
    //welcome message
    System.out.println("Hello User!!!");

    //prompt user to input choice
    System.out.printf("Enter unit of weight to convert into: \n1.kgs\n2.lbs\n");
    option = scanner.nextInt();
    if(option == 1){
      System.out.println("Enter your weight in lbs: ");
      weight = scanner.nextDouble();
      weight = weight * 0.453592; //weight conversion 
      System.out.printf("Your weight in kilograms is %.2f kgs\n", weight);
    }else if(option ==2){
      System.out.println("Enter your weight in kgs: ");
      weight = scanner.nextDouble();
      weight = weight * 2.2046; //conversion
      System.out.printf("Your weight in pounds is %.2f lbs\n", weight);
    }else{
      System.out.println("Invalid option selected");
    }

    scanner.close();
    
  }
}
