import java.util.Arrays;
public class Tri {

    // write your code here
    public static void sumTri(int[] nums){
        if(nums.length >= 1){
            int[] temp = new int[nums.length - 1];
            for(int i = 0; i < temp.length; i++){
                temp[i] = nums[i] + nums[i+1];
            }

            sumTri(temp);

            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        // test your code here
        sumTri(new int[]{1, 2, 3, 4, 5});
    }

}

/*

<question>
<title>Sum Triangle</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a recursive method that takes an array of ints and prints out a sum triangle. A sum triangle is where each number is the sum of the two consecutive numbers in the layer below it, with the initial array being the base layer. For example, an input of 1, 2, 3, 4, 5 would result in:
48              (20+28)
20, 28          (8+12, 12+16)
8, 12, 16       (3+5, 5+7, 7+9)
3, 5, 7, 9      (1+2, 2+3, 3+4, 4+5)
1, 2, 3, 4, 5   (input)

The parentheses are just for explanation, they should not be printed by your method.
</text>
<figure>
</figure>
<init>
import java.util.Arrays;
public class Tri {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

}
</init>
<answer>
import java.util.Arrays;
public class Tri {

    // write your code here
    public static void sumTri(int[] nums){
        if(nums.length >= 1){
            int[] temp = new int[nums.length - 1];
            for(int i = 0; i < temp.length; i++){
                temp[i] = nums[i] + nums[i+1];
            }

            sumTri(temp);

            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        // test your code here
        sumTri(new int[]{1, 2, 3, 4, 5});
    }

}
</answer>
</question>

*/
