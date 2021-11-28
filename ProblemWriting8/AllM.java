import java.util.Arrays;
public class AllM {

    // write your code here
    public static int[][] mults(int[] x, int[] y){
        int[][] result = new int[x.length][y.length];
        for(int row = 0; row < x.length; row++){
            for(int col = 0; col < y.length; col++){
                result[row][col] = x[row]*y[col];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // test your code here
        int[] x = new int[]{1, 2};
        int[] y = new int[]{1, 2, 3};
        int[][] test = mults(x, y);
        System.out.println(Arrays.deepToString(test));
    }
}

/*

<question>
<title>All Multiples</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method that takes two arrays of ints and uses them to create a 2d array containing all the possible multiples. For example, if passed 1, 2 and 1, 2, 3, the result should be

1, 2, 3
2, 4, 6
</text>
<figure>
</figure>
<init>
import java.util.Arrays;
public class AllM {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

}
</init>
<answer>
import java.util.Arrays;
public class AllM {

    // write your code here
    public static int[][] mults(int[] x, int[] y){
        int[][] result = new int[x.length][y.length];
        for(int row = 0; row < x.length; row++){
            for(int col = 0; col < y.length; col++){
                result[row][col] = x[row]*y[col];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // test your code here
        int[] x = new int[]{1, 2};
        int[] y = new int[]{1, 2, 3};
        int[][] test = mults(x, y);
        System.out.println(Arrays.deepToString(test));
    }
}
</answer>
</question>

*/
