public class Main{
  public static void main(String[] args) {
    //method arguments
    //arguments are values passed into a method 
    //we need to set up our method to receive arguments 
    //this is done using parameters
    //declaring variables
    String first = "LAMAO";
    String last = "ROFL";
    int age = 10; 
    double number = 8;
    
    //calling all methods
    happyBirthday(first, age);
    numSquare(number);
    getFullName(first, last);
    if(ageCheck(age)){
      System.out.println("You are above 18");
    }else{
      System.out.println("You are a minor");
    }
    System.out.println(numSquare(number));
  }
  static void happyBirthday(String name, int age){ //setting parameters: String name and Integer age 
    System.out.println("Happy Birthday to " + name + "!!!");
    System.out.println("You are " + age + " years old!");
  }
  static double numSquare(double number){ return number * number;}
  static String getFullName(String first, String last){return first + " " + last;}
  static boolean ageCheck(int age){
    if(age>=18){
      return true;
    }else{
      return false;
    }
  }
}
