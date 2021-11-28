import java.util.Arrays;

public class Filter{

  public static void main(String[] args){
    String[] list = new String[]{"duck", "ship", "whole"};
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", list));
  }

/*
Method to filter out swears from a String, text, given an array of swear words,
swear, to look out for. For each swear word, the method checks each possible segment
of the original text that is equal in length to see whether it is a swear. If it is,
the word is censored.
*/
  public static String swearFilter(String text, String[] swear){
    String result = text;
    for(int i = 0; i < swear.length; i++){  //check each swear
      String check = swear[i].toLowerCase(); //what to compare each segment to
      for(int j = 0; j < text.length()-swear[i].length(); j++){ //all segments of correct length
        String comp = text.substring(j, j+swear[i].length()).toLowerCase(); //segment to check with swear
        if(comp.equals(check)){
          for(int n = j+1; n < j+swear[i].length()-1; n++){
            result = result.substring(0, n) + "*" + result.substring(n+1);  //replace all letters except first and last with *
          }
        }
      }
    }
    return result;
  }
}
