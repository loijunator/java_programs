import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Arithmetic Operators
    //Addition, Subtraction, Multiplication, Division and Modulus
    int x = 0;
    int y = 0;
    int sum = 0;
    int dif = 0;
    int prod = 0;
    int div = 0;
    int rem = 0;

    //Operations
    sum = x + y;
    dif = x - y;
    prod = x * y;
    div = x / y;
    rem = x % y;
    
    //Augmented Assignment Operators
    //Instead of,
    //x = x + y; to return the sum of x+y and store it in x, we can do:
    x += y;
    //x = x - y;
    x -= y;
    //x = x * y;
    x *= y;
    //x = x / y;
    x /= y;
    //x = x % y;
    x %= y;

    //Increment and Decrement Operators
    //Used for adding or subtracting by 1 
    //x = x + 1; 
    x++;
    //x = x-1;
    x--;
   //Fill remaining, random things 
  }
}
