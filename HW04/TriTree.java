import java.util.*;
public class TriTree{

  public static void main(String[] args){
    Turtle t = new Turtle();
    t.left(90);
    t.delay(0);
    tree(t, 100, 7);
  }

/*
* Draws a ternary tree using recursion. Color changes from green to blue as the
* level decreases. The tilt of the left and right branch at each level is
* randomized between 30 of and 60.
* @param t: Turtle to be moved
* @param length: length of the branch to be drawn
* @param level: recursive level of the call
*/

  public static void tree(Turtle t, double length, int level){
    double tilt1 = Math.random() * 15 - 15 - level*2;
    double tilt2 = Math.random() * 15 - 15 - level*2;
    randColor(t);
    if(level==0){ //base case
      t.forward(length);
      t.penup();
      t.backward(length);
      t.pendown();
    }
    else{
      t.forward(length);
      t.left(45+tilt1);
      tree(t, length*0.9, level-1); //left branch
      t.right(45+tilt1);
      tree(t, length*0.5, level-1); //middle branch
      t.right(45+tilt2);
      tree(t, length*0.7, level-1); //right branch
      t.left(45+tilt2);
      t.penup();
      t.backward(length); //repositioning
      t.pendown();
    }
  }

/*
* Turns the Turtle to a random color
* @param t: Turtle to manipulate
*/
  public static void randColor(Turtle t){
    Random r = new Random();
    //random color that is blueish greenish
    int red = r.nextInt(25);
    int green = r.nextInt(256);
    int blue = r.nextInt(256);

    t.color(red, green, blue);
  }
}
