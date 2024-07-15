package thirdExecise;

import java.util.Scanner;

public class thirdExercise {

	public static void main(String[] args) {
		
		int A, B, C, D, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type four values, for A, B, C and D: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		result = (A*B) - (C*D);
		
		System.out.println("The difference between products AB to CD is: " + result);
		
		sc.close();
	}

}
