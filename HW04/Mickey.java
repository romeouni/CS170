public class Mickey{

  public static void main(String[] args){
    var t = new Turtle();
    t.delay(0);
    t.penup();  //position turtle to be able to use more screen
    t.right(90);
    t.forward(300);
    t.left(90);
    t.pendown();
    fractalMickeyMouse(t, 200, 6);

    t.color(147, 233, 190); //fill in background seafoam green
    t.penup();
    t.right(90);
    t.forward(10);
    t.fill();
    t.backward(10);
    t.left(90);
    t.color(0, 0, 0);
    t.pendown();
  }

/*
* Draws a Mickey Mouse face fractal recursively using faces as the ears.
* Each new level of faces is 0.5 times the size of the previous level.
* @param t: Turtle to move
* @param r: radius of face
* @param level: recursive level of the program
*/

  public static void fractalMickeyMouse(Turtle t, double r, int level){
    if(level==0){ //base case
      mickeyFace(t, r);
    }
    else{
      mickeyFace(t, r);
      //repositioning
      t.penup();
      for(int i = 0; i < 90; i++){
        t.forward(Math.PI*r/180);
        t.left(1);
      }
      t.forward(r*0.63);
      t.right(90);
      t.pendown();

      fractalMickeyMouse(t, r/2, level-1);
      //repositioning
      t.penup();
      t.backward(r*2.026);
      t.right(90);
      t.forward(r*0.01);
      t.left(90);
      t.pendown();

      fractalMickeyMouse(t, r/2, level-1);
      //repositioning
      t.penup();
      t.left(90);
      t.backward(r*1.61);
      t.right(90);
      t.forward(r*1.025);
      t.pendown();
    }

  }

/*
* Draws an individual Mickey Mouse face with no ears.
* @param t: Turtle to be moved
* @param r: radius of the face
*/

  public static void mickeyFace(Turtle t, double r){
    for(int i = 0; i < 360; i++){ //outline of face
      t.forward(Math.PI*r/180);
      t.left(1);
    }
    //repositioning
    t.penup();
    t.left(90);
    t.forward(r*0.8);
    t.left(90);
    t.forward(r*0.6);
    t.right(270);
    t.pendown();

    for(int j = 0; j < 180; j++){ //smile
      t.forward(Math.PI*r*0.6/180);
      t.left(1);
    }
    //repositioning
    t.penup();
    t.left(90);
    t.forward(r*0.65);
    t.pendown();

    oval(t, r/10);  //nose
    //repositioning
    t.penup();
    t.forward(r*0.15);
    t.right(90);
    t.forward(r*0.6);
    t.pendown();

    oval(t, r/6); //left eye
    //repositioning
    t.penup();
    t.right(90);
    t.forward(r*0.4);
    t.left(90);
    t.backward(r*0.15);
    t.pendown();

    oval(t, -r/6);  //right eye
    //repositioning to original position
    t.penup();
    t.left(90);
    t.forward(r*0.2);
    t.left(90);
    t.forward(r*1.24);
    t.pendown();
    t.left(90);
  }

/*
* Draws a rectangle with semicircle ends. Used for eyes and nose.
* @param t: Turtle to move
* @param size: relative size of shape drawn
*/

  public static void oval(Turtle t, double size){
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 180; j++){
        t.forward(Math.PI*size/180);
        t.left(1);
      }
      t.forward(size);
    }
  }
}
