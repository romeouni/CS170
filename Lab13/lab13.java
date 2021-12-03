import java.io.*;
import java.util.*;
public class lab13{

  public static void main(String[] args){
    System.out.println("Part 1:");
    String input = "12345";
    System.out.println(Arrays.toString(stringToArray(input, 6)));
    input = "2a68";
    System.out.println(Arrays.toString(stringToArray(input, 3)));
    input = "123";
    System.out.println(Arrays.toString(stringToArray(input, 4)));

    System.out.println("Part 2:");
    int[] subInput = new int[]{1,3,5,7};
    System.out.println(Arrays.toString(subarray(subInput,0,3)));
    int[] subInput2 = new int[]{2,4,6,8};
    System.out.println(Arrays.toString(subarray(subInput2,1,5)));
  }

  public static int[] stringToArray(String s, int n){
    String input;
    int index = 0;
    int[] result;
    if(s.length()>=n){
      result = new int[n];
    }
    else{
      result = new int[s.length()];
    }

    for(int i = 0; i < n; i++){
      try{
          result[index] = Integer.parseInt(s.substring(i, i+1));
          index++;
        } catch(NumberFormatException e){
          System.out.println("Index " + i + " is not an integer. Skipping index");
          n++;
        } catch(StringIndexOutOfBoundsException e){
          System.out.println("Stopping with only " + i + " numbers");
          return result;
        } catch(Exception e){
          System.out.println("Unknown error occurred. Skipping index " + i);
        }
      }
    return result;
  }

  public static int[] subarray(int[] x, int start, int end){
    int[] result = new int[end-start];
    int index = 0;
    for(int i = start; i < end; i++){
      try{
        result[index] = x[i];
        index++;
      } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array out of bounds");
      } catch(Exception e){
        System.out.println("Unknown error occurred");
      }
    }
    return result;
  }
}
