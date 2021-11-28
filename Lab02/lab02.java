public class lab02{

  public static void main(String[] args){
    Turtle t = new Turtle();
    t.delay(0);
    body(t);
    legs(t);
    head(t);
    // Call every method you need here
  }


  public static void head(Turtle t){  //code for head and positioning of the head
    move(t, 292.5);
    t.right(100);
    for(int j = 0; j < 240; j++){
      t.forward(.45);
      t.left(1);
    }
    for(int k = 0; k <240; k++){
      t.backward(.45);
      t.right(1);
    }
    t.left(100);

  }

  public static void legs(Turtle t){  //code for one leg and positioning the legs, repeated 4 times
    move(t, 20);
    extremity(t, .25);
    move(t, 50);
    extremity(t, .25);
    move(t, 100);
    extremity(t, .25);
    move(t, 110);
    extremity(t, .25);

  }

  public static void extremity(Turtle t, double size){ //code to draw a single leg or head
    t.right(100);
    for(int j = 0; j < 220; j++){
      t.forward(size);
      t.left(1);
    }
    for(int k = 0; k <220; k++){
      t.backward(size);
      t.right(1);
    }
    t.left(100);
  }

  public static void move(Turtle t, double distance){ //code to move along body
      for(int i = 0; i < distance; i++){
        t.forward(1);
        t.left(1);
      }
  }

  public static void tail(Turtle t){  //code for the tail and the positioning of the tail

  }

  public static void body(Turtle t){  //code of the body
    circle(t, 1, 360);
  }

  public static void circle(Turtle t, double length, int numSides) { //used for body
    for (int k = 0; k < numSides; k++) {
      t.forward(length);
      t.left(360.0/numSides);
    }
  }
}
