public class Arrays2DPractice {

  public static void main(String[] args) {
    // test transpose
    System.out.println("--- Test transpose ---");
    double[][] y = new double[][]{{10, 20, 30}, {40, 50, 60}};
    System.out.println(matrixToString(y, 2, 3));
    double[][] yt = transpose(y, 2, 3);
    System.out.println(matrixToString(yt, 3, 2));

    // test isTriangular
    System.out.println("--- Test isTriangular ---");
    double[][] z1 = new double[][]{{1, 0, 0},
                                   {1, 1, 0},
                                   {1, 1, 1}};
    System.out.println(matrixToString(z1, 3, 3));
    System.out.println("Is lower triangular: " + isLowerTriangular(z1, 3));
    System.out.println("Is upper triangular: " + isUpperTriangular(z1, 3));
    System.out.println("Is triangular: " + isTriangular(z1, 3));

    double[][] z2 = new double[][]{{1, 0, 0},
                                   {1, 1, 3},
                                   {1, 1, 1}};
    System.out.println(matrixToString(z2, 3, 3));
    System.out.println("Is lower triangular: " + isLowerTriangular(z2, 3));
    System.out.println("Is upper triangular: " + isUpperTriangular(z2, 3));
    System.out.println("Is triangular: " + isTriangular(z2, 3));

    double[][] z3 = new double[][]{{1, 0, 0},
                                   {0, 1, 3},
                                   {0, 0, 1}};
    System.out.println(matrixToString(z3, 3, 3));
    System.out.println("Is lower triangular: " + isLowerTriangular(z3, 3));
    System.out.println("Is upper triangular: " + isUpperTriangular(z3, 3));
    System.out.println("Is triangular: " + isTriangular(z3, 3));


    // test splitStrings
    System.out.println("--- Test splitStrings ---");
    String[][] q = splitStrings(new String[]{"apple", "book", "car"});
    System.out.println(array2DToString(q));
  }

  /**
   * Returns a string representation of a 2D array of doubles in the format:
   * [
   *  [x[0][0], x[0][1], x[0][m-1]]
   *  [x[1][0], x[1][1], x[1][m-1]]
   *  [...        ...        ...      ]
   *  [x[n-1][0], x[n-1][1], x[n-1][m-1]]
   * ]
   *
   * @param x a matrix (2D array) of doubles
   * @param n number of rows of x[][]
   * @param m number of columns of x[][]
   * @return a String representation of x[][]
   */
  public static String matrixToString(double[][] x, int n, int m) {
    if (x == null) {
      return null;
    }
    String result = "[\n";
    for (int row = 0; row < n; row++) {
      result += " [";
      for (int col = 0; col < m - 1; col++) {
        result += x[row][col] + ", ";
      }
      result += x[row][m - 1] + "]\n";
    }
    result += "]";
    return result;
  }

   /**
   * Returns a string representation of a 2D array of strings in the format:
   * [
   *  [x[0][0], x[0][1], ...]
   *  [x[1][0], x[1][1], ...]
   *  [...]
   *  [x[n-1][0], x[n-1][1], ...]
   * ]
   *
   * @param x a 2D array of strings
   * @param n number of rows of x[][]
   * @param m number of columns of x[][]
   * @return a String representation of x[][]
   */
  public static String array2DToString(String[][] x) {
    if (x == null) {
      return null;
    }
    String result = "[\n";
    for (int row = 0; row < x.length; row++) {
      result += " [";
      for (int col = 0; col < x[row].length - 1; col++) {
        result += x[row][col] + ", ";
      }
      result += x[row][x[row].length - 1] + "]\n";
    }
    result += "]";
    return result;
  }

  /**
   * Returns a new matrix that contains the transpose of a given
   * matrix with n rows and m columns.
   *
   * @param x a matrix (array of arrays) of doubles
   * @param n number of rows of x[][]
   * @param m number of columns of x[][]
   * @return the transpose of x[][]
   */
  public static double[][] transpose(double[][] x, int n, int m) {
    // To be implemented
    double[][] posed = new double[m][n];
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        posed[i][j] = x[j][i];
      }
    }
    return posed;
  }

  /**
   * Checks whether a given square matrix is lower triangular.
   * A lower triangular matrix is a special kind of square matrix
   * where all the entries above the main diagonal are zero.
   * https://en.wikipedia.org/wiki/Triangular_matrix
   *
   * @param x a matrix of doubles
   * @param n number of rows and columns of x[][]
   * @return true if x[][] is lower triangular, false otherwise
   */
  public static boolean isLowerTriangular(double[][] x, int n) {
    // To be implemented
    boolean lT = true;
    for(int row = 0; row < n; row++){
      for(int col = row+1; col < n; col++){
        if(x[row][col] != 0){
          lT = false;
        }
      }
    }
    return lT;
  }

  /**
  * Checks whether a given square matrix is upper triangular.
  * An upper triangular matrix is a special kind of square matrix
  * where all the entries below the main diagonal are zero.
  * https://en.wikipedia.org/wiki/Triangular_matrix
  *
  * @param x a matrix of doubles
  * @param n number of rows and columns of x[][]
  * @return true if x[][] is upper triangular, false otherwise
   */
  public static boolean isUpperTriangular(double[][] x, int n) {
    // To be implemented
    boolean uT = true;
    for(int row = 1; row < n; row++){
      for(int col = 0; col < row; col++){
        if(x[row][col] !=0){
          uT = false;
        }
      }
    }
    return uT;
  }

  /**
   * Checks whether a given square matrix is triangular.
   * A triangular matrix is a special kind of square matrix where
   * either all the entries below or all the entries above
   * the main diagonal are zero.
   *
   * @param x a matrix of doubles
   * @param n number of rows and columns of x[][]
   * @return true if x[][] is triangular, false otherwise
   */
  public static boolean isTriangular(double[][] x, int n) {
    // To be implemented
    if(isUpperTriangular(x, n) || isLowerTriangular(x,n)){
      return true;
    }
    return false;
  }

  /**
   * Given an array of strings, creates a 2D array of strings
   * where each row contains an array whose elements are the
   * individual characters of the corresponding input string.
   * For example, given the array {"apple", "book", "car"}
   * the method would return the 2D array:
   * {{"a", "p", "p", "l", "e"},
   *  {"b", "o", "o", "k"},
   *  {"c", "a", "r"}}
   *
   * @param s an array of strings
   * @return a 2D array of strings containing all the individual
   *         characters from the input strings (see example above)
   */
   public static String[][] splitStrings(String[] s) {
     // To be implemented
     return null;
   }

}
