public class NewCar{

/*
If I was only going based off of price and nothing else, then I would pick Car A
for five years and Car B for ten. Car B only becomes the more economical car
after nine years, so that would be the cutoff to choose between them.

Printing something will put it on the console to be seen, but returning something
will allow you to use the results of a method in other places. Basically,
printing is for humans to see/use, while returning is for the computer to see/use.
*/

  public static void main(String[] args){
    int input = 10;
    String answer = compareCars(input);
    System.out.println(answer + " is the more economical car after " + input + " years");
  }

/*
Method to compare the prices of two cars when given a specific number of years.
Calculates total cost year by year including intial cost, maintenance costs
and gas costs. Prints out a table by printing the total cost after calculating
each year.
*/

  public static String compareCars(int years){
    double costA = 20000; //intial cost of A
    double costB = 30000; //initial cost of B
    double maintA = 1300; //starting maintenance price of A
    double maintB = 1000; //starting maintenence price of B
    System.out.println("\t \t Car A \t \t Car B");  //Table header
    System.out.println("Year 0: \t" + costA + " \t" + costB);
    for(int i = 0; i < years; i++){ //loop goes year by year to calculate costs
      costA += 15000.0/25*2.5;
      costA += maintA;
      maintA = maintA * 1.15;

      costB += 15000.0/32*2.5;
      costB += maintB;
      maintB = maintB*1.1;

      System.out.println("Year " + (i+1) + ": \t" + (double)((int)(costA*100))/100 + " \t" + (double)((int)(costB*100))/100);
      //above is to print out cost within the table
    }

    if(costA<costB){ //returing which car is cheaper over given time span
      return "Car A";
    }
    else if(costB<costA){
      return "Car B";
    }
    else{
      return "neither car";
    }
  }
}
