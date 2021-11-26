import java.util.Arrays;

public class ReversePlace{

  public static void main(String[] args){
    int[] test = new int[]{0, 1, 2, 3, 4};
    System.out.println(Arrays.toString(test));
    System.out.println(Arrays.toString(reverse(test)));
  }

/*
Method that takes an array, orig, and modifies it to reverse the order of its
elements. For each position, the original value is stored in a temporary variable
the replaced with the corresponding value from the other end of the array. Then
replaces that corresponding value with the temporary value. Only goes half way
through because the places are swapped.
*/

  public static void reverse(int[] orig){
    int temp;
    for(int i = 0; i < orig.length/2; i++){
      temp = orig[i];
      orig[i] = orig[orig.length-1-i];
      orig[orig.length-1-i] = temp;
    }
  }
}
