public class DragonCurve{

  public static void main(String[] args){
    Turtle t = new Turtle(new TurtleWorld(1800, 900));
    t.delay(1);
    dCurve(t, 10, 20);
  }

  public static void dCurve(Turtle t, double size, int level){
    if(level==0){
      t.forward(size);
    }
    else{
      int sign = (int)Math.random()*-1+1;
      dCurve(t, size, level-1);
      t.left(90*sign);
      dCurve(t, size, level-1);
    }
  }

}

/*
public static void dCurve(Turtle t, double size, int level, int sign){
  if(level==0){
    t.forward(size);
  }
  else{
    dCurve(t, size, level-1, 1);
    t.left(90*sign);
    dCurve(t, size, level-1, -1);
  }
}
*/
