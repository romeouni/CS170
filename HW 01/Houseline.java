public class Houseline{

    public static void main(String[] args){
      Turtle t = new Turtle();
      houseline(t, 10);
    }

/*

loop to draw a house and move to the next position. Each loop, a higher and
higher number gets passed to the "house" method, decreasing it's size.

*/
    public static void houseline(Turtle t, int numHouses){
        for(int i = 1; i <= numHouses; i++){
          house(t, i);
          t.penup();
          t.forward(100/i); //the next house is the length of one window away, so length of house + window length.
          t.pendown();
        }
    }

/*

code below this comment was taken from Canvas page, but added scale parameter.
All movement is divided by scale, except for turns, which remain at the
correct angles.

*/
    public static void house(Turtle t, double scale) {
      front(t, scale);
      t.left(90);
      t.forward(80/scale);
      t.right(90);
      top(t, scale);
      t.left(90);
      t.backward(80/scale);
      t.right(90);
    }

    public static void front(Turtle t, double scale) {
      walls(t, scale);
      t.forward(30/scale);
      door(t, scale);
      t.penup();
      t.left(90);
      t.forward(50/scale);
      t.right(90);
      t.backward(20/scale);
      t.pendown();
      windows(t, scale);
      t.penup();
      t.backward(10/scale);
      t.left(90);
      t.backward(50/scale);
      t.right(90);
      t.pendown();
    }

    public static void top(Turtle t, double scale) {
      roof(t, scale);
      t.penup();
      t.forward(10/scale);
      t.left(90);
      t.forward(10/scale);
      t.right(90);
      t.pendown();
      chimney(t, scale);
      t.penup();
      t.backward(10/scale);
      t.right(90);
      t.forward(10/scale);
      t.left(90);
      t.pendown();
    }

    public static void walls(Turtle t, double scale) {
      square(t, 80/scale);
    }

    public static void windows(Turtle t, double scale) {
      square(t, 20/scale);
      t.penup();
      t.forward(40/scale);
      t.pendown();
      square(t, 20/scale);
      t.penup();
      t.backward(40/scale);
      t.pendown();
    }

    public static void door(Turtle t, double scale) {
      for (int i = 0; i < 2; i++) {
        t.forward(20/scale);
        t.left(90);
        t.forward(30/scale);
        t.left(90);
      }
    }

    public static void roof(Turtle t, double scale) {
      t.forward(80/scale);
      t.left(135);
      t.forward(40 * Math.sqrt(2)/scale);
      t.left(90);
      t.forward(40 * Math.sqrt(2)/scale);
      t.left(135);
    }

    public static void chimney(Turtle t, double scale) {
      t.left(90);
      t.forward(20/scale);
      t.right(90);
      t.forward(10/scale);
      t.right(90);
      t.forward(10/scale);
      t.backward(10/scale);
      t.left(90);
      t.backward(10/scale);
      t.left(90);
      t.backward(20/scale);
      t.right(90);
    }

    public static void square(Turtle t, double x) {
      for (int i = 0; i < 4; i++) {
        t.forward(x);
        t.left(90);
      }
    }

    }
