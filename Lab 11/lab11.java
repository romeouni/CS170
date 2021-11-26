import java.io.*;
public class lab11{

  public static void main(String[] args){
    String e1 = "1+2";
    System.out.println(e1 + " = " + evaluateExpression(e1));
    e1 = "5*7";
    System.out.println(e1 + " = " + evaluateExpression(e1));
    e1 = "10-4";
    System.out.println(e1 + " = " + evaluateExpression(e1));
    e1 = "72/9";
    System.out.println(e1 + " = " + evaluateExpression(e1));
    e1 = "2^4";
    System.out.println(e1 + " = " + evaluateExpression(e1));
    e1 = "20%3";
    System.out.println(e1 + " = " + evaluateExpression(e1));
    e1 = "3&7";
    System.out.println(e1 + " = " + evaluateExpression(e1));
  }

  public static int evaluateExpression(String e){
    String pattern = "(\\d+)([*+-/^%])(\\d+)";  //general RegEx for simple expression
    int num1 = 0;
    int num2 = 0;
    int result = 0;
    String oper = "";
    String temp = "";
    if(e.matches(pattern)){ //makes sure the input is a valid expression
      temp = e.replaceAll(pattern, "$1"); //extract first number
      num1 = Integer.parseInt(temp);
      temp = e.replaceAll(pattern, "$3"); //exract second number
      num2 = Integer.parseInt(temp);
      //set of if else cases to check which operand is given by the expression
      if(e.replaceAll(pattern, "$2").matches("\\*")){
        result = num1*num2;
      }
      else if(e.replaceAll(pattern, "$2").matches("\\+")){
        result = num1+num2;
      }
      else if(e.replaceAll(pattern, "$2").matches("-")){
        result = num1-num2;
      }
      else if(e.replaceAll(pattern, "$2").matches("/")){
        result = num1/num2;
      }
      else if(e.replaceAll(pattern, "$2").matches("\\^")){
        result = num1^num2;
      }
      else if(e.replaceAll(pattern, "$2").matches("%")){
        result = num1%num2;
      }
      return result;
    }
    System.out.println("Error: invalid input expression");
    return result;
  }
}
