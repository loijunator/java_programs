public class Main{
  public static void main(String[] args) {
    //methods:
    //--> block of reusable code that is executed when called ()
    //() is used to call method 
    //method == function 
    happyBirthday(); //method being called 

    // String name = "LAMAO";
    // int age = 9; 

    //methods are unfamiliar with variables declared in  other methods 
    //so happyBirthday method will not run if above variables are used 
  }
  //does not need to be static 
  //since we are calling from another static method (public static void main),
  //happyBirthday also needs to be static 
  static void happyBirthday (){
    System.out.println("Happy Birthday to you!!!");
    // System.out.println("You are " + age + " years old"); We will learn about how to use variables in next file
    System.out.println("May God bless you !!!");
  }
  //methods are useful for following D.R.Y. principle
  //D --> Don't 
  //R --> Repeat 
  //Y --> Yourself
}
