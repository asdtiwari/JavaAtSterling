// Write a program to calculate a profit or loss ?

public class ProfitLoss {
	public static void main(String[] args) {
		int sellingPrice = 4000;
		int costPrice = 3000;
		if(sellingPrice < costPrice) {
			System.out.println("Loss");
		}
		else if(sellingPrice == costPrice) {
			System.out.println("No profit, No Loss");
		}
		else {
			System.out.println("Profit");
		}
	}
}