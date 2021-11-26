public class DtoB{

  public static void main(String[] args){
    System.out.println(decimalToBinary(23));
  }

/*
Method to convert a given integer n into a string containing the equivalent
8 digit binary number. Finds the mod of the number with 2, then adds to the
beginning of the string, constructing the binary number. Then, divides the
number by 2 and repeats 8 times to fill the 8 digit string.
*/

  public static String decimalToBinary(int n){
    String result = "";
    int num = n;  //don't like changing inputs
    for(int i = 0; i < 8; i++){
      result = num%2 + result;
      num = num/2;
    }
    return result;
  }
}
