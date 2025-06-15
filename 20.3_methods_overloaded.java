public class Main{
  public static void main(String[] args) {
    //overloaded methods --> methods that share the same name but different parameters
    //signature => name + parameters
    //each signature should be UNIQUE
    //methods may share the same name but can NEVER share a signature
    System.out.println(add(1, 3, 4)); //change number of values here
  }
  static double add(double a, double b){ //first method adds only two numbers
    return a + b;
  }
  static double add(double a, double b, double c){ //second method for adding 3 numbers
    return a + b + c;
  }
} //method 'add' is commonly used for both adding two numbers and adding three numbers 
//methods may share the same name but never the [same name + same parameters]
