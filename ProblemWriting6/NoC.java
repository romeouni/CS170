public class NoC{

    public static void main(String[] args) {
        System.out.println(numChar("what"));
        System.out.println(numChar("way too long for the code"));
    }

    public static String numChar(String input){
        if(input.length()>10){
            return "That's too long!";
        }
        String result = "";
        for(int i = 0; i < input.length(); i++){
            result+=input;
        }
        return result;
    }
}

/*

<question>
<title>Number of Characters</title>
<type>JavaCode</type>
<points>0</points>
<text>
Write a program that will take a string and print out the string repeated as many times as there are characters in the string. If the string is more than 10 characters, return a statement saying "That's too long!" For example, if the input is "what", the output would be "whatwhatwhatwhat".
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
public class NoC{

    public static void main(String[] args) {
        System.out.println(numChar("what"));
        System.out.println(numChar("way too long for the code"));
    }

    public static String numChar(String input){
        if(input.length()>10){
            return "That's too long!";
        }
        String result = "";
        for(int i = 0; i < input.length(); i++){
            result+=input;
        }
        return result;
    }
}
</answer>
</question>

*/
