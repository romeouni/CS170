public class IsReverse{

  public static void main(String[] args){
    System.out.println(isReverse("happy", "yppah"));
    System.out.println(isReverse("cool", "loac"));
    System.out.println(isReverse("z", ""));
    System.out.println(isReverse("", ""));
  }

/*
* Uses recursion to check whether one string is the reverse of another. Each
* level makes sure the first character of s1 is the same as the last of s2,
* then removes those characters and passes the new strings to the next level
* of recursion
* @param s1: first String to check
* @param s2L second String to check 
*/

  public static boolean isReverse(String s1, String s2){
    if(s1.length()==0){
      if(s2.length()==0){
        return true;
      }
      return false;
    }
    if(s2.length()==0&&s1.length()!=0){
      return false;
    }

    if(s1.charAt(0)==s2.charAt(s2.length()-1)){
      return isReverse(s1.substring(1), s2.substring(0, s2.length()-1));
    }
    else{
      return false;
    }
  }
}
