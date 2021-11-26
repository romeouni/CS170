<question>
<title>Fibonacci</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method that takes an integer and returns that many numbers from the Fibonacci Sequence. For example, passing it the number 4 should print out the numbers 0, 1, 1, 2, because that is the first four numbers in the sequence.
</text>
<figure>
</figure>
<init>
public class X {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

    public static void fibNum(int x){

    }

}
</init>
<answer>
public class Fibonacci{

    public static void main(String[] args){
        fibNum(17);
    }

    public static void fibNum(int x){
        int a = 0;
        int b = 1;
        int temp;
        for(int i = 0; i < x; i++){
            System.out.println(a + " ");
            temp = b;
            b = temp+a;
            a = temp;
        }
    }
}
</answer>
</question>
