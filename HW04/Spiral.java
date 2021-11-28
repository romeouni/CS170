public class Spiral{

  public static void main(String[] args){
    Turtle t = new Turtle();
    turtleSpiral(t, 100, 25);
    t.penup();
    t.backward(200);
    t.right(180);
    t.pendown();
    turtleSpiralIter(t, 100, 25);
    t.hideturtle();
  }

/*
* Use recursion to draw a square spiral, given the length of the longest and
* shortest segments
* @param t: Turtle to be moved
* @param size: length of the longest segment of spiral
* @param minSize: length of the shortest segment of spiral
*/

  public static void turtleSpiral(Turtle t, double size, double minSize){
    if(size>=minSize){  //base case implied to be size<minSize
      t.forward(size);
      t.right(90);
      turtleSpiral(t, 0.9*size, minSize);
    }
  }

/*
* Uses a for loop to draw a square spiral, given the length of the longest and
* shortest segments
* @param t: Turtle to be moved
* @param size: length of the longest segment of spiral
* @param minSize: length of the shortest segment of spiral
*/

  public static void turtleSpiralIter(Turtle t, double size, double minSize){
    //keep drawing as long as the length of the segment is >= minSize
    for(double i = size; i >= minSize; i*=0.9){
      t.forward(i);
      t.right(90);
    }
  }
}
