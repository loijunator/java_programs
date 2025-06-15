public class Main{
  public static void main(String[] args) {
    //ternary operators --> ?
    //used to check if a condition is true or false
    //simpler version of using if-else statements
    //variable = (condition) ? ifTrue : ifFalse;
    int score = 50;
    String passOrFail = (score>=60) ? "PASS" : "FAIL";
    System.out.println(passOrFail);
  }
}
