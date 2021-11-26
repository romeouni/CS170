public class lab08{

  public static void main(String[] args){
    int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
    printMatrix(matrix);
    rotateImage(matrix);
    System.out.println();
    printMatrix(matrix);
  }

  public static void rotateImage(int[][] x){
    transpose(x);
    reverse(x);
  }

  public static void transpose(int[][] x){
    int numRows = x.length;
    int numCol = x[0].length;
    int temp;
    for(int row = 0; row < numRows; row++){
      for(int col = 0; col < row; col++){
        temp = x[row][col];
        x[row][col] = x[col][row];
        x[col][row] = temp;
      }
    }
  }

  public static void reverse(int[][] x){
    int numRows = x.length;
    int numCol = x[0].length;
    int temp;
    for(int row = 0; row < numRows; row++){
      for(int col = 0; col < numCol/2; col++){
        temp = x[row][col];
        x[row][col] = x[row][numCol-1-col];
        x[row][numCol-1-col] = temp;
      }
    }
  }

  public static void printMatrix(int[][] x){
    System.out.println("Matrix: ");
    for(int row = 0; row < x.length; row++){
      for(int col = 0; col < x[0].length; col++){
        System.out.print(x[row][col] + " ");
      }
      System.out.println();
    }
  }
}
