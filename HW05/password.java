public class password{

  public static void main(String[] args){
    System.out.println(isValidPassword("Tr7s6d_"));
    System.out.println(isValidPassword("@abc2-bc"));
    System.out.println(isValidPassword("ALphaa%"));
  }

  public static boolean isValidPassword(String s){
    String pattern = "^[A-Z!@#][\\w]{5,7}(?!=*.%$)";
    if(s.matches(pattern)){
      return true;
    }
    return false;
  }
}
