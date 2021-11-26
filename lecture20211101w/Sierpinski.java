public class Sierpinski {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    //t.delay(1);
    //sierpinski(t, 400, 7);

    // how many small triangles?
    // level 0:
    // level 1:
    // level 2:
    // level N:

    // what is the size of each small triangle?
    // level 0:
    // level 1:
    // level 2:
    // level N:

    // how many times is sierpinski called?
    // level 0:
    // level 1:
    // level 2:
    // level 3:
    // level N:
  }

  // Draws a fractal Sierpinski triangle.
  // Parameters:
  //   size: length of the side of the triangle
  //   level: depth of recursion, integer >= 0
  public static void sierpinski(Turtle t, double size, int level) {
    if (level == 0) {
        // base case: a Sierpinsky triangle at level 0 is just a triangle
    } else {
        // recursive case: shrink the previous level of Sierpinski
        // triangle in half, and repeat it three times
    }
  }

  public static void triangle(Turtle t, double x) {
    for (int i = 0; i < 3; i++) {
        t.forward(x);
        t.left(120);
    }
  }
}
