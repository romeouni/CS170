public class lab06{

  public static void main(String[] args){
    System.out.println(isPalindrome("was it a car or a cat i saw"));
  }

  public static boolean isPalindrome(String str){
    String newStr = str.replace(" ", "").toLowerCase();
    String half1, half2;
    if(str.length()%2==0){ //even # of characters
      half1 = newStr.substring(0, newStr.length()/2);
      half2 = newStr.substring(newStr.length()/2);
    }
    else{ //odd # of characters
      half1 = newStr.substring(0, newStr.length()/2);
      half2 = newStr.substring(newStr.length()/2+1);
    }
    String newHalf2 = "";
    for(int i = half1.length()-1; i >= 0; i--){
      newHalf2+=half2.charAt(i);
    }
    if(half1.equals(newHalf2)){
      return true;
    }
    else{
      return false;
    }
  }

  public static String reverseString_1(String text){
    text = text.replaceAll("\\p{Punct}", "");
    int wStart = 0;
    int letterAgo = 0;
    for(int i = 0; i < text.length(); i++){
      if(text.substring(i, i+1).equals("\s")){
        wStart = i;
      }
      else{

      }
    }
    return "";
  }


}
