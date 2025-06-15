import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Declare circle variables:
    double radius = 0;
    double circumference = 0;
    double area = 0;
    double volume = 0;
    
    //accept user input
    System.out.print("Enter radius of sphere: ");
    radius = scanner.nextDouble();
    
    //calculate area, circumference and volume
    circumference = 2 * Math.PI * radius;
    area = Math.PI * Math.pow(radius, 2);
    volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    
    System.out.println("Circumference of sphere is: " + circumference);
    System.out.println("Area of sphere is: " + area);
    System.out.println("Volume of sphere is: " + volume);

    scanner.close();
  }
}
