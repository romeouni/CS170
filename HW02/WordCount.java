public class WordCount{

  public static void main(String[] args){
    System.out.println(wordCount("This is a test"));
    System.out.println(wordCount("This  is  a  test!!!!"));
    System.out.println(wordCount(""));
    System.out.println(wordCount("Wahoo42!??"));
  }

/*
Method to count the number of words in a given string, with variable number of
spaces between words. The logic is to go character by character and check whether
it is a space. If it is, the program saves this in the boolean flag. Then, the
next time it finds a character that isn't a space, it knows that it has found a
new word. Then, it resets the flag to false.
*/

  public static int wordCount(String input){
    boolean flag = false; //to store whether the previous index was a space
    int result = 1; //in case there are no spaces, ie only one word
    if(input.equals("")){ //case for empty string
      return 0;
    }
    for(int i = 0; i < input.length()-1; i++){
      if(input.substring(i, i+1).equals(" ")){
        flag=true;  //next time, the program knows the previous slot was a space
      }
      else if(flag){  //you know that this index is not a space, so just check whether this is a new word
        result++;
        flag=false;
      }
    }
    return result;
  }
}
