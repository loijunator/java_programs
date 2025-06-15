public class Main{
  public static void main(String[] args) {
    //subtrings
    //string.substring(start, end);
    //Email example
    String email = "user123@hotmail.com";
    String username = email.substring(0, 7); //second index is exclusive
    String domain = email.substring(8);

    System.out.println(username);
    System.out.println(domain);
    //the above program is inflexible and cannot be used when username is different
    //hence we will make some changes:
    //we will use indexOf() method 
    username = email.substring(0, email.indexOf("@"));
    domain = email.substring(1+email.indexOf("@"));
    System.out.println(username);
    System.out.println(domain);
  }
}
