public class password{

  public static void main(String[] args){
    System.out.println(isValidPassword("Tr7s6d_"));
    System.out.println(isValidPassword("@abc2-bc"));
    System.out.println(isValidPassword("ALphaa%"));
  }

/*
* Checks whether the given string is a valid passowrd under the limitations
* given.
* @param s: String to be checked.
*/

  public static boolean isValidPassword(String s){
    //Password must start with an uppercase or special character
    //Password's first character must be followed by 5-7 word characters
    //Password's last character does not equal * . %
    //Password does not contain whitespace
    String pattern = "^[A-Z!@#][\\w]{5,7}(?!=*.%$)(?<!.*\\s.*)";

    if(s.matches(pattern)) return true;

    return false;
  }
}
