import java.util.Scanner;
import java.util.Random;
public class Main{
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    Random random = new Random();

    //simply generating a random number
    int rnd = random.nextInt();
    // System.out.println(rnd);
    // Range between -2 billion and +2 billion

    //Setting bounds for generation
    int die = random.nextInt(1, 7);
    //first number is inclusive, second number is exclusive, meaning second number will never be generated
    // System.out.println(die);

    //Generating random doubles
    double dbl = random.nextDouble(1, 11);
    // System.out.println(dbl);
    
    //Generating random bools, true or false
    Boolean bool = random.nextBoolean();
    System.out.println(bool);
    scanner.close();
  }
}
