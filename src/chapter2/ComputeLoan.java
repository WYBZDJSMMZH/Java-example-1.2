package chapter2;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Emter annual interst rate,e.g., 7.25: ");
		double annualInterstRate = input.nextDouble();
		double monthlyInterstRate = annualInterstRate / 1200;
		System.out.print(
				"Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		System.out.print(
				"Enter loan amunt, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		double monthlyPayment = loanAmount * monthlyInterstRate / (1 - 1 / Math.pow(1 + monthlyInterstRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly payment is $" + 
		(int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + 
		(int)(totalPayment * 100) / 100.0);
		

	}

}
