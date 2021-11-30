public class IntDiv{

  public static void main(String[] args){
    int[] a = new int[]{2, 4, 6, 0, 8, 16};
    System.out.println(sumOfIntegerDiv(a, 4));
    System.out.println(sumOfIntegerDiv(a, 5));
    System.out.println(sumOfIntegerDiv(a, 7));
  }

/*
* Returns the sum of each element divided by the previous element, up to
* a certain element. Uses try-catch to make the division more robust
* @param a: the array of numbers to be divided and added
* @param n: the number element that the method stops at
*/

  public static int sumOfIntegerDiv(int[] a, int n){
    int result = 0;

    for(int i = 1; i < n; i++){
      try{
        result += a[i]/a[i-1];
      }
      catch(ArrayIndexOutOfBoundsException e){  //if n is beyond the length of the array
        System.out.println("Cannot access array at index: " + i);
        break;
      }
      catch(ArithmeticException x){ //if an element is zero
        System.out.println("Cannot divide by zero. Skipping index: " + i);
        n++;
      }
      catch(Exception c){ //if some other issue pops up
        System.out.println("Something went wrong! Skipping index: " + i);
        n++;
      }
    }
    
    return result;
  }
}
