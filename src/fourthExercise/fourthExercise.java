package fourthExercise;

import java.util.Scanner;

public class fourthExercise {

	public static void main(String[] args) {
		int employeeNumber, workedHours;
		double valueHour ,salary;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What's your number: ");
		employeeNumber = sc.nextInt();
		
		System.out.print("Hours Worked: ");
		workedHours = sc.nextInt();
		
		System.out.print("Value per Hour: ");
		valueHour = sc.nextDouble();
		
		salary = valueHour * workedHours;
		
		System.out.println("Number:" + employeeNumber + " | Salary = " + salary);
		
		
	}

}
