public class PolygonWheel {

    // write your code here

    public static void main(String[] args) {
        // test your code here
        Turtle t = new Turtle();
        wheel(t, 50, 6);
    }

    public static void polygon(Turtle t, double length, int numSides){
        for(int i = 0; i < numSides; i++){
            t.forward(length);
            t.left(360.0/numSides);
        }
    }

    public static void wheel(Turtle t, double length, int polyNum){
        for(int i = 0; i < polyNum; i++){
            polygon(t, length, i+3);
            t.forward(length);
            t.right(360.0/polyNum);
        }
    }

}

/*

<question>
<title>PolygonWheel</title>
<type>JavaCode</type>
<points>0</points>
<text>
Using the methods polygon and wheel, write a code to draw a wheel of polygons with an escalating number of sides, each with equal side length. The first polygon should be a triangle, the next a square, the next a pentagon, and so on. The figure is a call with a side length of 50, and 6 polygons.
</text>
<figure>
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


</figure>
<init>
public class PolygonWheel {

    // write your code here

    public static void main(String[] args) {
        // test your code here
    }

    public static void polygon(Turtle t, double length, int numSides){
    }

    public static void wheel(Turtle t, double length){
    }

}
</init>
<answer>
public class PolygonWheel {

    // write your code here

    public static void main(String[] args) {
        // test your code here
        Turtle t = new Turtle();
        wheel(t, 50, 6);
    }

    public static void polygon(Turtle t, double length, int numSides){
        for(int i = 0; i < numSides; i++){
            t.forward(length);
            t.left(360.0/numSides);
        }
    }

    public static void wheel(Turtle t, double length, int polyNum){
        for(int i = 0; i < polyNum; i++){
            polygon(t, length, i+3);
            t.forward(length);
            t.right(360.0/polyNum);
        }
    }

}
</answer>
</question>

*/