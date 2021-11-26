public class lab04 {

	public static void main(String[] args) {
		System.out.println("Problem 1: Calculate the area of shaded area (two triangles)");
		int square_side = 4;

		// Here should should calculate the shaded area and store it to 'shaded_area_p1'
		double shaded_area_p1 = area_square(square_side)-area_triangle(square_side, square_side); // Replace this value
		System.out.println("The shaded area is "+shaded_area_p1);


		System.out.println("Problem 2: Calculate the area of shaded area (ring)");
		int radius_long = 4;
		int radius_short = 2;

		// Here should should calculate the shaded area and store it to 'shaded_area_p2'
		double shaded_area_p2 = area_circle(radius_long)-area_circle(radius_short); // Replace this value
		System.out.println("The shaded area is "+shaded_area_p2);


		System.out.println("Problem 3: Calculate the area of shaded area (rectangle)");
		int radius = 2;
		int rectangle_length = 12;
		int rectangle_width = 8;

		// Here should should calculate the shaded area and store it to 'shaded_area_p3'
		double shaded_area_p3 = area_rectangle(rectangle_length, rectangle_width) - area_circle(radius) * 4; // Replace this value
		System.out.println("The shaded area is " + shaded_area_p3);


		System.out.println("Problem 4: Display the equation and results");
		int n_1 = 6;
		int n_2 = 10;

		// Here should should store the equation to 's1' and 's2'
		String s1 = get_equation(n_1); // Replace this value
		String s2 = get_equation(n_2); // Replace this value

		System.out.println("Problem 4: The equation of n_1 is: "+s1);
		System.out.println("Problem 4: The equation of n_2 is: "+s2);
	}

	public static double area_circle(int radius){
		return Math.PI*(Math.pow(radius, 2));
	}

	public static double area_square(int side){
		return Math.pow(side, 2);
	}

	public static double area_triangle(int base, int height){
		return 0.5*base*height;
	}

	public static int area_rectangle(int length, int width){
		return length*width;
	}

	public static String get_equation(int n){
		double result = 0.0;
		String answer = "";
		for(int i = 1; i <= n; i++){
			result = result + Math.pow(2, -i);
			answer = answer + "+1/2^" + i;
		}
		System.out.println("The final result of " + n + " is: " + result);
		return answer;
	}
}
