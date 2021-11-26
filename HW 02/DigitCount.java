public class DigitCount{

  public static void main(String[] args){
    System.out.println(digitCount(456234, 5));
  }

/*
Method to check how many times a given digit occurs within a given number. Goes
digit by digit in the number and checks whether it mod 10 gives the digit. If it
does, then that is one instance of the digit. Then, divides the number by 10 to
move to next digit.
*/
  public static int digitCount(int number, int digit){
    int count = 0;
    int workNum = number; //don't want to edit input number
    while(workNum > 0){
      if(workNum % 10 == digit){ //results in one digit to compare
        count++;
      }
      workNum = workNum/10; //move to next digit
    }
    return count;
  }
}
