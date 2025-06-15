import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  double a = 0;
  double b = 0;
  System.out.print("Enter length of side a = ");
  a = scanner.nextDouble();
  System.out.print("Enter length of side b= ");
  b = scanner.nextDouble();
  
  double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  System.out.println("Length of Hypotenuse is= " + hypotenuse);
  scanner.close();  
  }
}
