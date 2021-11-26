public class lab05{

  public static void main(String[] args){
    fizzBuzz(1, 16);
    fizzBuzz(90, 100);
    findFactorsFor(10);
    findFactorsForWhile(10);
    findFactorsFor(42);
    findFactorsForWhile(42);
  }

  public static void fizzBuzz(int start, int end){
    for(int i = start; i <= end; i++){
      if(i%3==0 && i%5==0){
        System.out.print("FizzBuzz ");
      }
      else if(i%3==0){
        System.out.print("Fizz ");
      }
      else if(i%5==0){
        System.out.print("Buzz ");
      }
      else{
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void findFactorsFor(int x){
    for(int i = 1; i <= x; i++){
      if(x%i==0){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void findFactorsForWhile(int x){
    int i = 1;
    while(i <= x){
      if(x%i==0){
        System.out.print(i + " ");
      }
      i++; //initially got an infinite loop, forgot to add i++
    }
    System.out.println();
  }
}
