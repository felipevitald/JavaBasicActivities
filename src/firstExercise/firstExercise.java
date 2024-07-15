package firstExercise;

import java.util.Scanner;

public class firstExercise {

	public static void main(String[] args) {
		
		int x, y, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first value: ");
		x = sc.nextInt();
		
		System.out.println("enter the secondo value: ");
		y = sc.nextInt();
		
		result = x + y;
		
		System.out.println("The sum of the values is: " + result);
		
		sc.close();
	}
}
