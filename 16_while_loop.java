import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //while loop - run some code forever
    //while condition remains true 
    //declaring variable
    String name = "";
    int num = 0;

    //while loop
    while(name.isEmpty()){
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }
    System.out.println("Hello " + name);

    //do-while 
    do{
      System.out.print("Enter a number between 1 and 10: ");
      num = scanner.nextInt();
    }while(num<1 || num>10);
    System.out.println("You picked " + num);
    scanner.close();
  }
}
