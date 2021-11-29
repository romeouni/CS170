import java.util.regex.*;
public class Filter{

  public static void main(String[] args){
    String input = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
    String[] list = new String[]{"duck", "ship", "whole"};
    System.out.println(input);
    System.out.println(swearFilter(list, input));
  }

  public static String swearFilter(String[] swear, String text){
    String check;
    String temp = "";
    String result = text;
    for(int i = 0; i < swear.length; i++){
      if(swear[i].length()>text.length()){
        continue;
      }

      check = "(?i)(" + swear[i].charAt(0) + ")(" + swear[i].substring(1,
        swear[i].length()-1) + ")(" + swear[i].charAt(swear[i].length()-1) + ")";
      for(int j = 0; j < swear[i].length()-2; j++){
        temp += "*";
      }

      result = result.replaceAll(check, "$1"+temp+"$3");
      temp = "";
    }
    return result;
  }
}
