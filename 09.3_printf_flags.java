public class Main{
  public static void main(String[] args) {
    //setting price values:
    double price1 = 206.67;
    double price2 = 91909.11;
    double price3 = -54.03;
    //using flags:
    //+ --> returns +sign if number positive
    //, --> adds commas for thousands
    //( --> returns negative values in ()
    //space --> displays minus if negative, space if positive
    System.out.printf("%+.1f\n", price1);
    System.out.printf("%,f\n", price2);
    System.out.printf("%(f\n", price3);
    System.out.printf("% f\n", price3);
    
  }
}
