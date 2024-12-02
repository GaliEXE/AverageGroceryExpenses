package gali;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df_var = new DecimalFormat("#.##");
		ArrayList<Double> groceryTotals = new ArrayList<>();
		Double monthlyTotalCoupon = null;
		Double weeklyAvgCoupon = null;
		Double monthlyTotal = null;
		Double weeklyAvg = null;
		
		System.out.print("If you are using coupons please enter the percent off as a decimal (exmp: .10 for 10%) \n"
				+ "If you have no coupons type 0:");

		double couponAmount = scanner.nextDouble();
		
		if (couponAmount >= 1) {
			couponAmount = .1;
			System.out.println("Coupons can't be or exceed 100%, readjusting coupon to 10%");
		}
		
		for(int i = 0; i<4; i++) {
			int c = i + 1;
			System.out.print("What was your grocery bill for week " + c + ": ");
			groceryTotals.add(scanner.nextDouble());
		}
		
		scanner.close();
		
		Double[] groceryTotalArray = groceryTotals.toArray(new Double[0]);
		Double Week1Total = groceryTotalArray[0];
		Double Week2Total = groceryTotalArray[1];
		Double Week3Total = groceryTotalArray[2];
		Double Week4Total = groceryTotalArray[3];
		
		if(couponAmount != 0) {
			monthlyTotal = Week1Total + Week2Total + Week3Total + Week4Total;
			weeklyAvg = (Week1Total + Week2Total + Week3Total + Week4Total) / 4;
			Week1Total = Week1Total - (Week1Total * couponAmount);
			Week2Total = Week2Total - (Week2Total * couponAmount);
			Week3Total = Week3Total - (Week3Total * couponAmount);
			Week4Total = Week4Total - (Week4Total * couponAmount);
			monthlyTotalCoupon = Week1Total + Week2Total + Week3Total + Week4Total;
			weeklyAvgCoupon = (Week1Total + Week2Total + Week3Total + Week4Total) / 4;
		} else {
			monthlyTotal = Week1Total + Week2Total + Week3Total + Week4Total;
			weeklyAvg = (Week1Total + Week2Total + Week3Total + Week4Total) / 4;
		}
		
		if(couponAmount != 0) {
			System.out.println("Your Monthly Total is: " + df_var.format(monthlyTotal) + ",\n Your Weekly Average is: "
					+ df_var.format(weeklyAvg) + ".");
			System.out.println("Your Monthly Average w/ Coupons is: " + df_var.format(monthlyTotalCoupon)
					+ ",\n Your Weekly Average w/ Coupons is: " + df_var.format(weeklyAvgCoupon) + ".");
		} else {
			System.out.println("Your Monthly Average is: " + df_var.format(monthlyTotal) + ",\n Your Weekly Average is: "
					+ df_var.format(weeklyAvg) + ".");
		}
	}
}

//END OF PROGRAM