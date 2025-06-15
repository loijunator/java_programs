import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Variable Declaration
    String adjective1;
    String adjective2;
    String adjective3;
    String noun1;
    String verb1;

    //Story Output
    System.out.println("Today I went to a _____ restaurant.");
    System.out.println("There I ate _____ and it tasted _____");
    System.out.println("Then I had a stomachache and it was very _____");
    System.out.println("That night I _____ and it was good.");

    //Story Input
    System.out.print("Enter Adjective 1: ");
    adjective1 = scanner.nextLine();
    System.out.print("Enter Adjective 2: ");
    adjective2 = scanner.nextLine();
    System.out.print("Enter Adjective 3: ");
    adjective3 = scanner.nextLine();
    System.out.print("Enter Verb 1: ");
    verb1 = scanner.nextLine();
    System.out.print("Enter Noun 1: ");
    noun1 = scanner.nextLine();
    
    // Final Output of Story with user-input words
    System.out.println("Today I went to a " + adjective1 + " restaurant.");
    System.out.println("There I ate " + noun1 + " and it tasted " + adjective2);
    System.out.println("Then I had a stomachache and it was very " + adjective3);
    System.out.println("That night I " + verb1 + " and it was good.");

    scanner.close();
  }
}
