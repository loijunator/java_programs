public class Main{
  public static void main(String[] args) {
    //for loop - execute a code block a CERTAIN number of times 
    //while loop can execute infinitely until condition is met 
    //for (statement1; statement2 ; statement3){}
    //statement -> used for initialization; e.g. counter i
    //statement 2 -> condition e.g. i<10;
    //statement 3 -> step; increment or decrement the counter e.g. i++
    
    for(int i=0; i<10; i++){
      System.out.println("Print number " + i);
    }
    for(int i=0; i<20; i+=2){ //can even increment/decrement by other numbers
      System.out.println(i);
    }
  }
}
