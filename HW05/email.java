public class email{

  public static void main(String[] args){
    System.out.println(isValidEmail("user_123@gmail.com"));
    System.out.println(isValidEmail("user123alpha@gmail.com"));
  }

/*
* Checks whether a given string is a valid email address according to the
* requirements given.
* @param s: string that is checked
*/

  public static boolean isValidEmail(String s){
    //pattern with requirements included
    String pattern = "^[A-Za-z](\\w){1,9}@[A-Za-z][a-ZA-Z0-9]{1,11}\\.[a-z]{3}$";
    if(s.matches(pattern)){
      return true;
    }
    return false;
  }
}
