public class Main{
  public static void main(String[] args) {
    //creating price values
    double price1 = 206.67;
    double price2 = 91.11;
    double price3 = -57.07;

    System.out.printf("%f\n", price1);
    System.out.printf("%f\n", price2);
    System.out.printf("%f\n", price3);
    //here, in the output we notice that 6 digits after the decimal are displayed
    //now, using precision, we can specify number of digits
    System.out.println("After using .precision :");
    System.out.printf("%.1f\n", price1); //.1 specifies one decimal place 
    System.out.printf("%.2f\n", price2); //.2 specifies two decimal places 
    System.out.printf("%.3f\n", price3); //.3 specifies three decimal places 
  }
}
