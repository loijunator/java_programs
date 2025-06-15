public class Main{
  public static void main(String[] args) {
    //setting integers
    int num1 = 7;
    int num2 = 18;
    int num3 = 250;
    int num4 = 3401;
   
    //width flags -> sets padding
    //0 --> zero padding
    //number --> right justified padding
    //negative number --> left justified padding
    //setting width to 4 because largest number has 4 digits
    //this will make it look even
    System.out.printf("%04d\n", num1); //zero ensures that padding is filled by 0s
    System.out.printf("%4d\n", num2); //removing 0 results in blank padding
    System.out.printf("%-4d\n", num1); //negative number pushes the padding to right side
    System.out.printf("%04d\n", num4);
  }
}
