package fifthExerscise;

import java.util.Scanner;

public class fifthExercise {

	public static void main(String[] args) {
		int itemID, itemAmount, itemID2, itemAmount2;
		double itemValue, Value, itemValue2, Value2, totalValue; 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Item ID: ");
		itemID = sc.nextInt();
		
		System.out.print("item Amount: ");
		itemAmount = sc.nextInt();
		
		
		System.out.print("Item Value: ");
		itemValue = sc.nextDouble();
		
		Value = (itemAmount * itemValue);
	
		System.out.print("Item ID: ");
		itemID2 = sc.nextInt();
		
		System.out.print("item Amount: ");
		itemAmount2 = sc.nextInt();
		
		
		System.out.print("Item Value: ");
		itemValue2 = sc.nextDouble();
		
		Value2 = (itemAmount2 * itemValue2);
		
		totalValue = Value + Value2;
		
		System.out.printf("Value to pay = " + ".%2f%n", totalValue);
	}

}
