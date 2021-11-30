public class movie{

  public static void main(String[] args){
    System.out.println(extractTitle("<item><title>Split (2017)</title><meta><imdb>6375308</imdb></meta>"));
  }

/*
* Extracts the title of a movie from the IMDB movie information written in
* XML using regex
* @param s: IMDB movie information
*/

  public static String extractTitle(String s){
    String pattern = ".+(<title>)(.+)(</title>).+"; //title is always between these two tags
    String result = s.replaceAll(pattern, "$2");  //extract title from between tags
    
    return result;
  }
}
