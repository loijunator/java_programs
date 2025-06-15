import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Shopping cart program:
    String item;
    double price;
    int quantity;
    char currency = '$';
    double total;

    //Accepting user input:
    System.out.print("Enter the name of the item to be purchased: ");
    item = scanner.nextLine();
    System.out.print("Enter the price of the item: ");
    price = scanner.nextDouble();
    System.out.print("Enter the number of items to be purchased: ");
    quantity = scanner.nextInt();
    
    total = price * quantity;
    System.out.println("Your Shopping Cart:");
    System.out.println("Item Name: " + item);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Total Price: " + currency + total);
  
    scanner.close();
  }
}
