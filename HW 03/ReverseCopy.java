import java.util.Arrays;

public class ReverseCopy{

  public static void main(String[] args){
    int[] test = reverseCopy(new int[]{1, 2, 3});
    System.out.println(Arrays.toString(test));
  }

/*
Method that takes an array, orig, and creates a new array where the elements of
orig are reversed. It iterates upwards through the copy and down through the orig,
inserting each element into the copy.
*/

  public static int[] reverseCopy(int[] orig){
    int[] copy = new int[orig.length];  //same length
    for(int i = 0; i < orig.length; i++){
      copy[i] = orig[orig.length-i-1];  //count down through the orig to find correct element
    }
    return copy;
  }
}
