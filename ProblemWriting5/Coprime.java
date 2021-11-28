public class Coprime{

    public static void main(String[] args){
        System.out.println(coprime(10, 5));
        System.out.println(coprime(71, 72));
    }

    public static String coprime(int x, int y){
        if(x%y==0 || y%x==0){
            return x + " and " + y + " are not coprime.";
        }
        else{
            return x + " and " + y + " are coprime.";
        }
    }
}

/*

<question>
<title>Coprime</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a method, coprime, that takes two integers and returns whether they are coprime. This means that the only positive integer divisor they share is 1. This method should return a String with a complete sentence saying whether the inputs are coprime. Use the main method to demonstrate both outcomes.
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
public class Coprime{

    public static void main(String[] args){
        System.out.println(coprime(10, 5));
        System.out.println(coprime(71, 72));
    }

    public static String coprime(int x, int y){
        if(x%y==0 || y%x==0){
            return x + " and " + y + " are not coprime.";
        }
        else{
            return x + " and " + y + " are coprime.";
        }
    }
}
</answer>
</question>

*/
