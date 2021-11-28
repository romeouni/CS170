import java.util.*;
import java.io.*;
public class lab12{

  public static void main(String[] args){
    String input;
    Scanner sc = new Scanner(System.in);
    Console console = System.console();

    System.out.println("Using Scanner: ");
    do{
      System.out.println("Enter a correct password: ");
      input = sc.nextLine();
      if(valid(input)){
        wFile(input);
        System.out.println("Congratulations! Your password has been saved successfully.");
      }
    } while(!valid(input)); //as long as password doesn't work

    input = ""; //reset input

    System.out.println("Using Console: ");
    do{
      System.out.println("Enter a correct password: ");
      input = console.readLine();
      if(valid(input)){
        wFile(input);
        System.out.println("Congratulations! Your password has been saved successfully.");
      }
    } while(!valid(input)); //as long as password doesn't work


  }

/**
* method to check whether a string has the predetermined qualities that a
* password should have.
* @param s: string that is being checked
**/

  public static boolean valid(String s){
    //at least 1 capital letter, 1 lowercase, 1 digit, 1 special character and
    //between 8 and 20 characters long
    String pattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%&]).{8,20}";
    //?= checks without using up the character
    if(s.matches(pattern)){
      return true;
    }
    else{
      return false;
    }
  }

  public static void wFile(String s){
    BufferedWriter bw = null;
    try{
      File f = new File("myfile.txt");
      if(!f.exists()){
        f.createNewFile();
      }

      FileWriter fw = new FileWriter(f);
      bw = new BufferedWriter(fw);

      bw.write(s);
    }
    catch(Exception e){
      return;
    }
    finally{
      try{
        if(bw!= null){
          bw.close();
        }
      }
      catch(Exception e){
        System.out.println("bw error");
      }
    }
    bw.close();
    fw.close();
  }
}
