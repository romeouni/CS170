public class AverageLength{

  public static void main(String[] args){
    System.out.println(avgLength(new String[]{"Hello", "Q"}));
    System.out.println(avgLength(new String[]{}));
    System.out.println(avgLength(new String[]{"Hello", "Goodbye"}));
  }

/*
Method to find the average length of all strings in the array it receives, input.
It iterates through the array, adding all the lengths of the strings together,
then divides by the number of elements in the array.
*/

  public static double avgLength(String[] input){
    double total = 0.0;
    double result = 0.0;
    if(input.length == 0){  //array with no elements
      return 0.0;
    }
    for(int i = 0; i < input.length; i++){
      total += input[i].length();
    }
    result = total/input.length;
    return result;
  }
}
