import java.util.Arrays;

public class Vowels{

  public static void main(String[] args){
    System.out.println(Arrays.toString(tally("HEY! Apples and bananas!")));
  }

/*
Method that takes a String, input, and returns an array showing how many times
each vowel occurs in the String. Does this by iterating through each char of the
String and checks whether it is equal to any vowel, lowercase or uppercase.
*/

  public static int[] tally(String input){
    int[] result = new int[5];
    for(int i = 0; i < input.length(); i++){
      if(input.charAt(i)==65||input.charAt(i)==97){ //a
        result[0]++;
      }
      else if(input.charAt(i)==69||input.charAt(i)==101){ //e
        result[1]++;
      }
      else if(input.charAt(i)==73||input.charAt(i)==105){ //i
        result[2]++;
      }
      else if(input.charAt(i)==79||input.charAt(i)==111){ //o
        result[3]++;
      }
      else if(input.charAt(i)==85||input.charAt(i)==117){ //u
        result[4]++;
      }
    }
    return result;
  }
}
