public class Polyspiral{

    public static void main(String[] args){
        Turtle t = new Turtle();
        t.delay(0);
        polyspiral(t, 3, 20, 3);
        t.penup();
        t.forward(200);
        t.pendown();
        polyspiral(t, 4, 10, 4);
        t.penup();
        t.backward(200);
    }

/*

code based off code given after lecture on 9/8. Draws spiral based of info given in call.
parameters: turtle to draw with, int n is the # of sides in the polygon, double
  base is the length of the smallest side of the spiral, int rounds is the #
  of concentric rings of the polygon there should be.

*/

    public static void polyspiral(Turtle t, int n, double base, int rounds){
      for (int i = 0; i < rounds*n; i++) {  //number of segments of spiral
        t.forward((i + 1) * base);
        t.right(360.0/n);
      }
      for (int i = rounds*n - 1; i >= 0; i--) { //returning to the original position
        t.left(360.0/n);
        t.backward((i + 1) * base);
      }
    }
}
