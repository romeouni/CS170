public class a1{

  public static void main(String[] args){
    int[] x= new int[]{3, 2, 7, 1};
    int[] y = new int[]{5, 6};
    String[] z = new String[]{"phone", "printer", "computer"};
    for(int i = 0; i < y.length; i++){
      int j = x[i];
      int k = z.length-1;
      while(k>0){
        while(j < z[k].length()){
          System.out.println(z[k].charAt(j) + "+" + z[k].charAt(j-1));
          j++;
        }
        k--;
      }
    }
  }
}
