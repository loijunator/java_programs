import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    int age = 0;
    String name;
    //Accept age as input from user
    System.out.print("Enter your age: ");
    age = scanner.nextInt();
    scanner.nextLine(); //added due to error where name string was not being accepted 
    //Accept name as input from user
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    
    //String condition to check if name is empty
    if(name.isEmpty()){
      System.out.println("You did not enter your name!!!");
    }else{
      System.out.println("Hello " + name + "!!!");
    }

    //Age conditions
    if(age>=18) {
      System.out.println("You are an adult.");
    }else if(age<0) {
      System.out.println("You have not been born yet!");
    }else if(age==0){
      System.out.println("You are an infant");
    }else if(age<18) { //else if statement
      System.out.println("You are not an adult.");
    }else {
      System.out.println("Age entered is invalid!!!");
    }
    scanner.close();
  }
}
