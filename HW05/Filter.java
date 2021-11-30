import java.util.regex.*;
public class Filter{

  public static void main(String[] args){
    String input = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
    String[] list = new String[]{"duck", "ship", "whole", "l"};
    System.out.println(input);
    System.out.println(swearFilter(list, input));
  }

/*
* Uses regex to filter out swear words from a given texxt, based on a list
* of swear words.
* @param swear: array containing a list of swear words to filter out
* @param text: the sentence that must be put through the filter
*/

  public static String swearFilter(String[] swear, String text){
    String check;
    String temp = "";
    String result = text;
    
    for(int i = 0; i < swear.length; i++){  //cycle through whole swear list
      //make sure swear is at least 3 characters long, program does nothing if not
      if(swear[i].length()<=2) continue;

      //make a pattern out of the swear, using three groups
      check = "(?i)(" + swear[i].charAt(0) + ")(" + swear[i].substring(1,
        swear[i].length()-1) + ")(" + swear[i].charAt(swear[i].length()-1) + ")";
      for(int j = 0; j < swear[i].length()-2; j++){ //make string w correct # of *
        temp += "*";
      }

      //replace middle characters with asterisks
      result = result.replaceAll(check, "$1"+temp+"$3");
      temp = "";
    }
    return result;
  }
}
