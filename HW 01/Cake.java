public class Cake {
  public static void main(String[] args) {
    Turtle y = new Turtle();

  //Variables
    int g = 150;

  // Base Cake
      t.pendown();
    for(int i = 0; i < 4; i++){
      t.forward(g);
      t.left(90);
    }

  // Position Second Layer
      t.penup();
      t.forward(g);
      t.left(90);
      t.forward(g);

  // Second Layer
      pendown();
    for(int i = 0; i < 4; i++) {
      t.forward(g/2);
      t.right(90);
    }

  // Position Candle
      t.penup();
      t.forward(g/2);
      t.right(90);
      t.forward(g/4);

  // Candle
      t.pendown();
      t.left(90);
      t.forward(50);

  }

}
