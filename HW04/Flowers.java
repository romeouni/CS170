public class Flowers{

  public static void main(String[] args){
    Turtle t = new Turtle();
    t.delay(1);
    t.penup();
    t.backward(400);
    t.pendown();
    t.left(90);
    simpleFlower(t, 200);
    t.penup();
    t.right(90);
    t.forward(200);
    t.left(90);
    t.pendown();
    fractalFlower(t, 250, 3);
    t.penup();
    t.right(90);
    t.forward(300);
    t.left(90);
    t.pendown();
    fractalFlower(t, 300, 4);
  }

/*
* Draws a single flower.
* @param t: Turtle to be moved
* @param size: Length of stem, 3 times the length of the petals
*/

  public static void simpleFlower(Turtle t, double size){
    t.forward(size);
    for(int i = 0; i < 8; i++){
      t.forward(size/3.0);
      t.backward(size/3.0);
      t.right(45);
    }
    t.backward(size);
  }

/*
* Uses recursion to draw a fractal flower. At the end of each petal is another
* level of the fractal flower, up till the level called
* @param t: Turtle to be moved
* @param size: length passed to simpleFlower
* @param level: level of recursion
*/

  public static void fractalFlower(Turtle t, double size, int level){
    if(level==1){
      simpleFlower(t, size);
    }
    else{
      t.forward(size);
      for(int i = 0; i < 8; i++){
        fractalFlower(t, size/3.0, level-1);
        t.right(45);
      }
      t.backward(size);
    }
  }
}
