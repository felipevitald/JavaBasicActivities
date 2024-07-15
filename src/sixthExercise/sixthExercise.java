package sixthExercise;

import java.util.Locale;
import java.util.Scanner;

public class sixthExercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double A, B, C, triangle, circle, square, rectangle, trapezoid, pi = 3.14159;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Value A: ");
		A = sc.nextDouble();
		System.out.print("Value B: ");
		B = sc.nextDouble();
		System.out.print("Value C: ");
		C = sc.nextDouble();
		
		triangle = A * C /2;
		circle = pi * C * C;
		trapezoid = (A + B) / 2.0 * C;
		rectangle = A * B;
		
		System.out.printf("TRIANGLE: %.3f%n", triangle);
		System.out.printf("CIRCLE: %.3f%n", circle);
		System.out.printf("TRAPEZOID: %.3f%n", trapezoid);
		System.out.printf("RECTANGLE: %.3f%n", rectangle);
		
		
		sc.close();
		
	}
}
