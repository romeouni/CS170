import java.util.Arrays;

public class Grades{

  public static void main(String[] args){
    System.out.println(Arrays.toString(studentAverages(new int[][]{{50,100,0}, {100,100,80}})));
  }

/*
Method that takes a matrix of students and grades, grades, and finds the average
for each student, returning it in an array. Goes through each column of a row and
averages whatever it finds and adds it to the result array.
*/

  public static double[] studentAverages(int[][] grades){
    double[] result = new double[grades.length];
    double tot = 0.0;
    for(int row = 0; row < grades.length; row++){
      for(int col = 0; col < grades[row].length; col++){
        tot += grades[row][col];
      }
      result[row] = tot/grades[row].length;
      tot = 0.0;
    }
    return result;
  }
}
