public class Main{
  public static void main(String[] args){
    //break --> break out of a loop --> STOP
    //continue --> skip current iteration of a loop --> SKIP
    for(int i=0; i<10; i++){
      System.out.print(i + " ");
      if(i==5){
        break; //the output is stopped midway at 5 
      }
    }
    System.out.println(" ");
    for(int i=0; i<10; i++){
      if(i==5){
        continue; //skips 5 alone
      }
      System.out.print(i + " ");
    }
  }
}
