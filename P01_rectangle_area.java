import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double length = 0;
    double breadth = 0;
    double area = 0;
    System.out.print("Enter length of rectangle: ");
    length = scanner.nextDouble();
    System.out.print("Enter breadth of rectangle: ");
    breadth = scanner.nextDouble();
    area = length * breadth;
    System.out.println("Area of the rectangle is = " + area);
    scanner.close();
  }
}
