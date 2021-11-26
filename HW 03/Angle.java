public class Angle{

  public static void main(String[] args){
    System.out.println(angle(new double[]{1, 2, 3}, new double[]{4, 5}));
    System.out.println(angle(new double[]{0}, new double[]{4, 5}));
    System.out.println(angle(new double[]{3, 0}, new double[]{0, 3}));
    System.out.println(angle(new double[]{2, 1, 5, -4}, new double[]{6, 3, 15, -12}));
  }

/*
Method to calculate the angle between two given vectors, x and y. Finds the dot
product of the two and divides it by the magnitudes of x and y multiplied. Then
finds the arc cos of the result and converts it to degrees.
*/

  public static double angle(double[] x, double[] y){
    if(magnitude(x)==0||magnitude(y)==0){ //if either of the magnitudes is 0, the angle is 0
      return 0.0;
    }

    double rad = Math.acos(dotProduct(x, y)/(magnitude(x)*magnitude(y)));
    return Math.toDegrees(rad);
  }

/*
Method to find the dot product of two arrays, a and b. Checks whether one is longer
than the other, then goes through each space in both vectors, multiplying them
before adding to the total. Returns the total.
*/

  public static double dotProduct(double[] a, double[] b){
    double result = 0.0;
//find the length of the smaller vector, because if one is larger than the other, the
//extra spaces should be counted as 0's. Since it's multiplied, you can ignore these
//spots in both vectors.
    int min = 0;
    if(a.length<b.length){
      min = a.length;
    }
    else{
      min = b.length;
    }
    for(int i = 0; i < min; i++){
      result = result + a[i]*b[i];
    }
    return result;
  }

/*
Method to find the magnitude of a vector, x. Goes through each number in the vector,
squares it and adds it to the total. Then returns the square root of this total.
*/

  public static double magnitude(double[] x){
    double tot = 0.0;
    for(int i = 0; i < x.length; i++){
      tot += x[i]*x[i];
    }
    return Math.sqrt(tot);
  }
}
