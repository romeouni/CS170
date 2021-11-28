public class MedievalTown{

/*

positions turtle to have space for full drawing, then draws each object before
  aligning for the next object.

*/
    public static void main(String[] args){
      Turtle t = new Turtle();
      t.delay(0);
      t.penup();
      t.backward(300);
      t.left(90);
      t.forward(160);
      t.right(90);
      t.forward(50);
      t.pendown();
      sky(t);
      t.penup();
      t.backward(520);
      t.right(90);
      t.forward(160);
      t.left(90);
      t.pendown();
      range(t);
      t.penup();
      t.backward(560);
      gate(t);
      t.penup();
      t.forward(60);
      t.left(90);
      t.forward(10);
      for(int i = 0; i < 3; i++){
        t.pendown();
        arch(t);
        t.penup();
        t.backward(50);
        t.right(90);
        t.forward(20);
      }
      t.penup();
      t.backward(70);
      t.left(90);
      t.forward(40);
      t.right(90);
      forest(t);
      t.hideturtle();
    }

/*

generic method to draw 8 pointed star.

*/

    public static void star(Turtle t){
      for(int i=0; i<8; i++){
        t.forward(10);
        t.backward(10);
        t.right(45);
      }
    }

/*

method to consolidate all star drawing and repositioning involved.

*/

    public static void sky(Turtle t){
      star(t);
      t.penup();
      t.forward(40);
      t.right(90);
      t.forward(40);
      t.left(90);
      t.pendown();
      star(t);
      t.penup();
      t.forward(40);
      t.left(90);
      t.forward(40);
      t.right(90);
      t.pendown();
      star(t);
      t.penup();
      t.forward(80);
      t.left(90);
      t.forward(30);
      t.right(90);
      t.pendown();
      star(t);
      t.penup();
      t.forward(40);
      t.right(90);
      t.forward(70);
      t.left(90);
      t.pendown();
      star(t);
      t.penup();
      t.forward(130);
      t.left(90);
      t.forward(50);
      t.right(90);
      t.pendown();
      star(t);
      t.penup();
      t.forward(60);
      t.right(90);
      t.forward(60);
      t.left(90);
      t.pendown();
      star(t);
      t.penup();
      t.forward(80);
      t.left(90);
      t.forward(50);
      t.right(90);
      t.pendown();
      star(t);
    }

/*

generic method to draw one mountain

*/

    public static void mountain(Turtle t){
      t.forward(Math.hypot(160, 80));
      t.right(90);
      t.forward(Math.hypot(120, 60));
    }

/*

method to consolidate all mountain drawing and repositioning involved.

*/

    public static void range(Turtle t){
      double angle = 90 - Math.toDegrees(Math.atan(2)); //angle away from horizontal that all mounains are tilted at
      t.left(angle);
      mountain(t);
      t.backward(Math.hypot(80, 40));
      t.left(90);
      mountain(t);
      t.backward(Math.hypot(20, 10));
      t.left(90);
      mountain(t);
      t.left(90-angle);
    }

/*

generic method to draw a tree

*/

    public static void tree(Turtle t){
      t.forward(40);
      for(int i = 0; i < 5; i++){
        t.right(135);
        t.forward(Math.hypot(10, 10));  //branch #1
        t.backward(Math.hypot(10, 10)); //return to trunk
        t.left(90);
        t.backward(Math.hypot(10, 10)); //branch #2
        t.forward(Math.hypot(10, 10));  //return to trunk
        t.left(45);
        t.backward(5);  //position for next branch
      }
    }

/*

method to consolidate all drawing of trees and repositioning involved

*/

    public static void forest(Turtle t){
      for(int j = 0; j < 2; j++){ //2 rows of trees
        for(int i = 0; i < 4; i++){ //4 trees in each row
          tree(t);
          t.backward(15);
          t.penup();
          t.right(90);
          t.forward(30);
          t.left(90);
          t.pendown();
        }
        t.penup();
        t.backward(40);
        t.left(90);
        t.forward(160);
        t.right(90);
        t.pendown();
      }
    }

/*

generic method to draw one arch

*/

    public static void arch(Turtle t){
      t.forward(30);
      for(int i = 0; i < 180; i++){ //half of 360 degrees to make a semicircle
        t.forward(.35); //outer curve
        t.right(1);
      }
      t.forward(30);
      t.right(90);
      t.forward(10);
      t.right(90);
      t.forward(30);
      for(int j = 0; j < 180; j++){
        t.forward(.175);  //inner curve
        t.left(1);
      }
      t.forward(31);
      t.right(90);
      t.forward(10);
    }

/*

generic method to draw one tower.

*/

    public static void tower(Turtle t){
      for(int i=0; i<5; i++){ //for loop to draw parapets
        t.forward(10);
        t.pendown();
        t.left(90);
        t.forward(10);
        t.right(90);
        t.forward(10);
        t.right(90);
        t.forward(10);
        t.left(90);
      }
      t.right(90);
      t.forward(10);
      t.right(Math.toDegrees(Math.atan(2))); //angle for narrowing tower
      t.forward(Math.hypot(10, 20));
      t.left(Math.toDegrees(Math.atan(2)));
      t.forward(100);
      t.right(90);
      t.forward(50);
      t.right(90);
      t.forward(100);
      t.left(Math.toDegrees(Math.atan(2))); //angle for narrowing tower
      t.forward(Math.hypot(10, 20));
      t.right(Math.toDegrees(Math.atan(2)));
      t.forward(10);
      t.penup();
      t.backward(40);
      t.right(90);
      t.forward(30);
      t.pendown();
      for(int i = 0; i < 3; i++){ //3 rows of windows
        windowRow(t);
        t.penup();
        t.backward(20);
        t.right(90);
        t.forward(20);
        t.left(90);
        t.pendown();
      }
    }

/*

method to draw two windows in a tower.

*/

    public static void windowRow(Turtle t){
      for(int i = 0; i  < 4; i++){ //draw a square
        t.forward(10);
        t.left(90);
      }
      t.penup();
      t.forward(20);
      t.pendown();
      for(int j = 0; j < 4; j++){ //second square
        t.forward(10);
        t.left(90);
      }
    }

/*

method to consolidate all components of the gate (two towers, two brick walls
  and an arch in the middle)

*/

    public static void gate(Turtle t){
      tower(t);
      t.penup();
      t.left(90);
      t.forward(10);
      t.right(90);
      t.forward(40);
      t.pendown();
      bricks(t);
      t.penup();
      t.right(90);
      t.forward(75);
      t.right(90);
      t.forward(35);
      t.left(180);
      t.pendown();
      arch(t);
      t.penup();
      t.backward(40);
      t.right(90);
      t.forward(30);
      t.right(90);
      t.pendown();
      bricks(t);
      t.penup();
      t.right(90);
      t.forward(45);
      t.left(90);
      t.forward(85);
      t.right(90);
      tower(t);
    }

/*

method to draw one brick wall

*/

    public static void bricks(Turtle t){
      for(int i = 0; i < 7; i++){   //7 rows of bricks
        for(int j = 0; j < 2; j++){ //each row
          t.forward(80);
          t.left(90);
          t.forward(5);
          t.left(90);
        }
        t.penup();
        t.right(90);
        t.forward(5);
        t.left(90);
        t.pendown();
      }
      t.penup();
      t.forward(10);
      t.left(90);
      t.forward(5);
      t.pendown();
      for(int p = 0; p < 4; p++){ //there are 4 rows that are split at this alignment
        for(int k = 0; k < 7; k++){ //7 splits in this alignment
          bSplit(t);
        }
        t.penup();
        t.forward(10);
        t.left(90);
        t.forward(70);
        t.right(90);
        t.pendown();
      }
      t.penup();
      t.backward(35);
      t.left(90);
      t.forward(5);
      t.right(90);
      t.pendown();
      for(int l = 0; l < 3; l++){ //there are 3 rows that are split in this alignment
        for(int x = 0; x < 8; x++){ //8 splits in this alignment
          bSplit(t);
        }
        t.penup();
        t.forward(10);
        t.left(90);
        t.forward(80);
        t.right(90);
        t.pendown();
      }
    }

/*

method to draw one line between bricks and reposition for the next line.

*/

    public static void bSplit(Turtle t){
        t.pendown();
        t.forward(5);
        t.penup();
        t.backward(5);
        t.right(90);
        t.forward(10);
        t.left(90);
    }
}
