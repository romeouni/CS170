public class Polywheel{

    public static void main(String[] args){
        Turtle t = new Turtle();
        t.penup(); //giving space for all test cases
        t.backward(400);
        t.pendown();
        polywheel(t, 3, 70);
        t.penup();
        t.forward(180);
        t.pendown();
        polywheel(t, 4, 50);
        t.penup();
        t.forward(200);
        t.pendown();
        polywheel(t, 5, 40);
        t.penup();
        t.forward(200);
        t.pendown();
        polywheel(t, 6, 30);
        t.penup();
        t.backward(180); //return to original position
    }

/*

method to create the wheel itself. draws a polygon with attributes requested,
  then positions itself for the next polyon in the wheel.
parameters: t is the turtle to draw with, numSides is the number of sides of
  the polygon, length is the side length of the polygon

*/
    public static void polywheel(Turtle t, int numSides, double length){
        for(int i = 0; i < numSides; i++){
            polygon(t, numSides, length);
            t.forward(length);
            t.right(360.0/numSides);
        }
    }

/*

generic method to create a polygon with a given number of sides and
  side length. draws one side, then turns the appropriate amount based on the
  requested number of sides. loops until all sides are drawn
parameters: t is the turtle to draw with, numSides is the number of sides of
  the polygon, length is the side length of the polygon

*/
    public static void polygon(Turtle t, int numSides, double length){
        for(int i = 0; i < numSides; i++){
            t.forward(length);
            t.left(360.0/numSides);
        }
    }
}
