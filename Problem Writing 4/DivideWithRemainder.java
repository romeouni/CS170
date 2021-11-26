<question>
<title>Divide with Remainder</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method divR(int x, int y) that will divide x by y, as well as give the remainder. Print both of these resulting numbers.
</text>
<figure>
</figure>
<init>
public class X {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

    public static void divR(int x, int y){

    }

}
</init>
<answer>
public class DivideWithRemainder{

    public static void main(String[] args){
        divR(22, 7);
    }

    public static void divR(int x, int y){
        System.out.println("The quotient of " + x + " and " + y + " is " + x/y + ".");
        System.out.println("The remainder is " + x%y + ".");
    }
}
</answer>
</question>
