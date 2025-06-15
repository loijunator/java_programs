public class Main {
  public static void main(String[] args) {
    //Order of Operations : PEMDAS
    double result = 3 + 4 * (7-5)/2.0;

    // From left to right, P-E-M-D-A-S goes:
    //   1. P - Parantheses - Enclosed operations first
    //   2. E - Exponents
    //   3. M - Multiplication
    //   4. D - Division
    //   5. A - Addition
    //   6. S - Subtraction
    // By applying PEMDAS to above question, the order will be:
    //   result = 3+4 * 2/2;
    //   result = 3 + 8/2;
    //   result = 3 + 4;
    //   result = 7;

    System.out.println("Result = " + result);
    
  }
}
