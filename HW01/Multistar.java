public class Multistar{

    public static void main(String[] args){
        Turtle t = new Turtle();
        t.delay(5);
        t.penup();
        t.backward(300);  //space for mutliple test cases
        t.pendown();
        multistar(t, 25, 120);
        t.penup();
        t.forward(250);
        t.pendown();
        multistar(t, 10, 70);
        t.penup();
        t.forward(200);
        t.pendown();
        multistar(t, 7, 100);
        t.penup();
        t.backward(250); //return to starting position
    }

/*

method to create the full mutistar. draws a ray, draws the star at the end of
  the ray, returns to the center of the multistar, turns the appropriate amount
  based on the number of rays requested, then repeats.
parameters: t is the turtle to draw with, n is the number of rays, length is
  the length of each ray.

*/

    public static void multistar(Turtle t, int n, double length){
        for(int i = 0; i < n; i++){
            t.forward(length);
            star(t, n, length/4); //each mini ray is 1/4 the length of a full one
            t.backward(length);
            t.left(360.0/n);
        }
    }

/*

generic method to draw a star. draws a ray, returns to center of star, turns
  appropriate amount given number of rays requested, loops until complete.
parameters: t is the turtle to draw with, n is the number of rays, length is
  the length of each ray.

*/

    public static void star(Turtle t, int n, double length){
        for(int i = 0; i < n; i++){
            t.forward(length);
            t.backward(length);
            t.left(360.0/n);
        }
    }
}
