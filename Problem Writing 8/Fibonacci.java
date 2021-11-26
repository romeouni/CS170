public class Fibonacci {

    // write your code here
    public static int fibo(int x){
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }

    public static void main(String[] args) {
        // test your code here
        for(int i = 0; i < 10; i++){
            System.out.println(fibo(i));
        }
    }

}

/*

<question>
<title>Fibonacci</title>
<type>JavaCode</type>
<points>0</points>
<text>
Using recursion, write a method that will return the term of the Fibonacci sequence that is passed to it. 0 will return 0, 1 will return 1, 2 will return 1, 3 will return 2, and so on.
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
public class X {

    // write your code here
    public static int fibo(int x){
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }

    public static void main(String[] args) {
        // test your code here
        for(int i = 0; i < 10; i++){
            System.out.println(fibo(i));
        }
    }

}
</answer>
</question>

*/
