public class Main{
  public static void main(String[] args) {
    //Creating spongebob character
    String name = "Spongebob";
    char surname = 'S';
    int age = 5;
    double height = 60;
    Boolean isEmployed = true;
    // % [flags][width][.precision][specifer-character]
    System.out.printf("Hello %s\n", name); //%s for string 
    System.out.printf("Your surname is %c\n", surname); //%c for characters
    System.out.printf("You are %d years old\n", age); //%d for int characters
    System.out.printf("You are %f inches tall\n", height); //%f for double characters
    System.out.printf("Employed: %b\n", isEmployed); //%b for boolean characters
    //Now, all in one sentence:
    System.out.printf("%s is %d years old. He is %f inches tall and his surname is %c.\n", name, age, height, surname);
  }
}
