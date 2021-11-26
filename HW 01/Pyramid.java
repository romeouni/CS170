public class Pyramid{

    public static void main(String[] args){
        Turtle t = new Turtle();
        t.delay(0);
        pyramid(t, 200, 10);
        t.penup();
        t.forward(250);
        t.pendown();
        pyramid(t, 200, 5);
        t.penup();
        t.backward(250);
    }

/*

method to draw one pyramid, then position turtle at original position.
parameters: turtle to draw with, double base is the length of the bottom
  side, int levels is the number of layers on the pyramid.

*/
    public static void pyramid(Turtle t, double base, int levels){
        double baseSquares = 2*levels-1;  //number of squares on the bottom row
        double sLength = base/baseSquares;  //size of a square
        for(int j=0; j<levels; j++){
            for(int i=0; i<baseSquares-2*j; i++){ //adjusting # base squares b/c each consecutive row has 2 less squares on it.
              square(t, sLength);
            }
            t.penup();
            t.backward(sLength * (baseSquares-(2*j+1))); //readjusting to beginning of row to start new layer
            t.left(90);
            t.forward(sLength);
            t.right(90);
            t.pendown();
          }
        t.penup();
        t.backward(levels*sLength); //going back to original position.
        t.left(90);
        t.backward(levels*sLength);
        t.right(90);
    }
/*

generic code to draw one square given a turtle and a side length.

*/
    public static void square(Turtle t, double length){
        for(int i=0; i<4; i++){
            t.forward(length);
            t.left(90);
        }
        t.forward(length);
    }
}
