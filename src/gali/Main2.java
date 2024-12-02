package gali;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main2 {

	public static void main2(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df_var = new DecimalFormat("#.##");
		int[] groceryTotals = {};

		System.out.print("If you are using coupons please enter the percent off as a decimal (exmp: .10 for 10%) \n"
				+ "If you have no coupons type 0:");

		double couponAmount = scanner.nextDouble();
		
		for(int i = 0; i<4; i++) {
			int c = i + 1;
			System.out.print("What was your grocery bill for week " + c + ": ");
			groceryTotals[i] = scanner.nextInt();
		}
		
		System.out.print(groceryTotals);
		
		
	}
}
