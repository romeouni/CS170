public class IntDiv{

  public static void main(String[] args){
    int[] a = new int[]{2, 4, 6, 0, 8, 16};
    System.out.println(sumOfIntegerDiv(a, 4));
    System.out.println(sumOfIntegerDiv(a, 5));
  }

  public static int sumOfIntegerDiv(int[] a, int n){
    int result = 0;
    for(int i = 1; i < n; i++){
      try{
        result += a[i]/a[i-1];
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Cannot access array at index: " + i);
        n++;
      }
      catch(ArithmeticException x){
        System.out.println("Cannot divide by zero. Skipping index: " + i);
        n++;
      }
      catch(Exception c){
        System.out.println("Something went wrong! Skipping index: " + i);
        n++;
      }
    }
    return result;
  }
}
