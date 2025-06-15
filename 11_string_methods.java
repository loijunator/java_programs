public class Main{
  public static void main(String[] args) {
    //declare String
    String name = "Prahallad Kashyap";
    
    //string methods:
    int length = name.length(); //returns number of characters in string , including blanks
    char letter = name.charAt(3); //returns character at (no.) place
    int index = name.indexOf("l"); //finds first occurring index of input character
    int lastIndex = name.lastIndexOf("l"); //finds last occurring index of input character
    System.out.println(length);
    System.out.println(letter);
    System.out.println(index);
    System.out.println(lastIndex);

    //Upper & Lower Case methods
    String random = "LaMaO";
    random = random.toUpperCase(); //converts all characters to upper case
    System.out.println(random);
    random = random.toLowerCase(); //converts all characters to lower case                                  
    System.out.println(random);

    //Remove whitespace --> removes blanks from start and end of string
    String white = "        etc etc etc        ";
    white = white.trim(); //removes blanks 
    System.out.println(white);

    //replace character 
    random = random.replace("o", "a"); //replaces all os with as
    System.out.println(random);

    //Boolean functions 
    System.out.println(name.isEmpty()); //checks if name string is empty or not
    if(name.contains("")){ //checks if (character) is present in the __name__
      System.out.println("what the hell is that character");
    }else{
      System.out.println("Normal name");
    }
    String username = "Password";
    if(username.equals("password")){ //checks if two string are equal in characters, case-sensitive
      System.out.println("Name cannot be same as password");
    }else{
      System.out.println("Name is correct");
    }
    if(username.equalsIgnoreCase("password")){ //same method as above but this time not case-sensitive
      System.out.println("Name cannot be same as password");
    }else{
      System.out.println("Name is correct");
    }
  }
}
