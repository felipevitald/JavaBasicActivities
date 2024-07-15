package secondExercise;

import java.util.Scanner;

public class secondExercise {

	public static void main(String[] args) {
		
		float radius, result;
		
		float pi = (float) 3.14159;
		
		Scanner sc = new Scanner (System.in);
	
		System.out.print("enter value of the radius of a circle: ");
		radius = sc.nextFloat();
		
		result = (radius*2) * pi;
		
		System.out.printf("The value of the area of the circle is: " + "%.4f%n", result);
		
		sc.close();
		

	}

}
