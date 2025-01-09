public class ProfitAndLoss {
	public static void main(String[] args) {
		// given cost price 
		int costPrice = 129;
		// given selling price
		int sellingPrice = 191;

		// finding the profits
		float profit = sellingPrice - costPrice;

		// finding the profit percentage
		float profitPercentage = profit / costPrice * 100;

		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}