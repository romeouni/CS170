public class Count9 {

    // write your code here
    public static int count(int n){
        if(n==0){
            return 0;
        }
        if(n%10==9){
            return 1 + count(n/10);
        }
        return 0 + count(n/10);
    }

    public static void main(String[] args) {
        // test your code here
        System.out.println(count(919));
    }

}

/*

<question>
<title>Number of 9s</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method that takes a number and returns the number of times the digit 9 appears in the number. You should use recursion, not loops to accomplish this.
</text>
<figure>
</figure>
<init>
public class Count9 {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

}
</init>
<answer>
public class Count9 {

    // write your code here
    public static int count(int n){
        if(n==0){
            return 0;
        }
        if(n%10==9){
            return 1 + count(n/10);
        }
        return 0 + count(n/10);
    }

    public static void main(String[] args) {
        // test your code here
        System.out.println(count(919));
    }

}
</answer>
</question>

*/
