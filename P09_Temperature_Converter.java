import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //declare variables:
    double temp;
    String unit;

    //Prompt user for temperature and option
    System.out.println("Welcome to temperature unit converter!!!");
    System.out.printf("Please enter temperature: ");
    temp = scanner.nextDouble();
    System.out.printf("Convert to Celsius or Fahrenheit (C or F):  ");
    unit = scanner.next().toUpperCase();

    //calculation
    temp = (unit.equals("C")) ? (temp - 32) * 5.0 / 9.0 : (temp * 5.0 / 9.0) + 32;
    System.out.printf("The temperature is %.2f %s\n", temp, unit);
    scanner.close();
  }
}
