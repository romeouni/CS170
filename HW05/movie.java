public class movie{

  public static void main(String[] args){
    System.out.println(extractTitle("<item><title>Split (2017)</title><meta><imdb>6375308</imdb></meta>"));
  }

  public static String extractTitle(String s){
    String pattern = ".+(<title>)(.+)(</title>).+";
    String result = s.replaceAll(pattern, "$2");
    return result;
  }
}
