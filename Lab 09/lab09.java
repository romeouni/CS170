public class lab09{

  public static void main(String[] args){
    System.out.println(decimalToBinary(0));
    System.out.println(decimalToBinary(7));
    System.out.println(decimalToBinary(256));
    System.out.println(decimalToBinary(1001));
    System.out.println(binaryToDecimal("0"));
    System.out.println(binaryToDecimal("1010"));
    System.out.println(binaryToDecimal("1010111"));

  }

  public static String decimalToBinary(int d){
    if(d <= 1){
      return "" + d%2;
    }
    return decimalToBinary(d/2) + d%2;
  }

  public static int binaryToDecimal(String b){
    int length = b.length();
    int temp = 0; //digit from b
    if(b.length()==0){
      return 0;
    }
    temp = Integer.parseInt(b.substring(0, 1));
    return temp*(int)Math.pow(2, length-1) + binaryToDecimal(b.substring(1));
  }
}
