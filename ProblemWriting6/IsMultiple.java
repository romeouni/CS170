public class IsMultiple{

    public static void main(String[] args){
        System.out.println(isMult(4, 8));
        System.out.println(isMult(4, 5));
    }

    public static String isMult(int x, int y){
        if(y%x==0){
            return y + " is a multiple of " + x;
        }
        else{
            return y + " is not a multiple of " + x;
        }
    }
}

/*

<question>
<title>IsMultiple</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method that takes two integers and determines if the second integer is a multiple of the first.
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
public class IsMultiple{

    public static void main(String[] args){
        System.out.println(isMult(4, 8));
        System.out.println(isMult(4, 5));
    }

    public static String isMult(int x, int y){
        if(y%x==0){
            return y + " is a multiple of " + x;
        }
        else{
            return y + " is not a multiple of " + x;
        }
    }
}
</answer>
</question>

*/
