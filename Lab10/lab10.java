import java.util.*;
public class lab10{

  public static void main(String[] args){
    Turtle t = new Turtle();
    t.delay(0);
    sierpinskiCarpet(t, 200, 4);
  }

  public static void sierpinskiCarpet(Turtle t, double size, int level){
    if(level==0){
      System.out.println("base");
      square(t, size);
    }
    else{
      double skip = 0.0; //size*0.2;
      double nextSize = (size-skip)/3;
      for(int i = 0; i < 4; i++){
        sierpinskiCarpet(t, size/3, level-1);
        t.penup();
        t.forward(size/3);
        t.pendown();

        sierpinskiCarpet(t, size/3, level-1);
        t.penup();
        t.forward(size/3);
        t.pendown();


        t.penup();
        t.forward(size/3);
        t.left(90);
        t.pendown();
      }
    }
  }

  public static void square(Turtle t, double s){
    Random r = new Random();
    int red = r.nextInt(256);
    int green = r.nextInt(256);
    int blue = r.nextInt(256);
    t.color(red, green, blue);
    for(int i = 0; i < 4; i++){
      t.forward(s);
      t.left(90);
    }
    t.penup();
    t.pendown();
  }
}
