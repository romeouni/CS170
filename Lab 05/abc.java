public class abc{

  public static void main(String[] args){
    int a = 5;
    int b = 3;
    String c = "a";
    for(int i = a; i >=b; i--){
      c+=a;
      System.out.println(c);
      for(int j = b; j < a; j++){
        c+=b;
        System.out.println(c);
      }
    }
    System.out.println(c);
  }
}
