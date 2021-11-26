public class OddOrEven{

    public static void main(String[] args){
       System.out.println(oddEven(72));
       System.out.println(oddEven(13));
    }

    public static String oddEven(int x){
        if(x%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}

/*

<question>
<title>Odd or Even?</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method, oddEven, that takes an integer and returns a String saying either "odd" or "even", correctly identifying which one the integer is. Use the main method for test cases returning each option.
</text>
<figure>
</figure>
<init>
public class X {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

}
</init>
<answer>
public class OddOrEven{

    public static void main(String[] args){
       System.out.println(oddEven(72));
       System.out.println(oddEven(13));
    }

    public static String oddEven(int x){
        if(x%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}
</answer>
</question>

*/
