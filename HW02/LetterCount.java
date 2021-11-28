public class LetterCount{

  public static void main(String[] args){
    System.out.println(letterCount("abc-abc-123-ABC", "b"));
    System.out.println(letterCount("This is interesting!", "z"));
    System.out.println(letterCount("", "q"));
  }

/*
Method to count number of instances of a given letter c in a given string s.
Goes letter by letter through s and checks whether it's equal to c. If it is
the total goes up.
*/
  public static int letterCount(String s, String c){
    int result = 0;
    for(int i = 0; i < s.length()-1; i++){
      if(s.substring(i, i+1).equals(c)){ //substring to have a one character string to compare to c
        result++;
      }
    }
    return result;
  }
}
