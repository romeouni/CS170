public class SomeMath{

  public static void main(String[] args){
    System.out.println("sumOfSquares(6) = " + sumOfSquares(6));
    System.out.println("product(6, 5) = " + product(6, 5));
    System.out.println("compoundInterest(1000, 0.05, 3) = " + compoundInterest(1000, 0.05, 3));
    System.out.println("polySpiralLength(3, 5, 8) = " + polySpiralLength(3, 5, 8));
  }

/*
Method to return the sum of all squares between 1 and the input integer. Starts
the result at zero, then adds each consecutive square to it.
*/
  public static int sumOfSquares(int n){
    int result = 0; //starting point
    for(int i = 1; i < n +1; i++){ //the sum starts at 1^2 all the way to n^2
      result += Math.pow(i, 2);
    }
    return result;
  }

/*
Method to find the product of two given integers. Uses a for loop to go add
x to itself y times.
*/

  public static int product(int x, int y){
    int result = 0;
    for(int i = 0; i < y; i++){ //repeat y times
      result += x; //add x to itself
    }
    return result;
  }

/*
Method to find total amount of money after a given amount of years with a given
interest rate and principal. Multiplies the money by the rate, then adds it to
the total, and it repeats for the number of years.
*/

  public static double compoundInterest(double money, double interestRate, int years){
    for(int i = 0; i < years; i++){
      money += money*interestRate; //both finds interest given and updates money total
    }
    return money;
  }

/*
Method to find the length of a polygonal spiral with a given number of sides n, a
given original side length base and a given number of loops rounds. Code based
off code of a polygonal spiral from Turtle code.
*/

  public static double polySpiralLength(int n, double base, int rounds){
    double length = 0; //initialize length at 0
      for(int i = 0; i < rounds*n; i++){ //rounds*n is total number of segments
        length += (i+1)*base; //increments the length of the segment
      }
    return length;
  }
}
