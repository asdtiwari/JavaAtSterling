// Discount eligibility based on their membership [silver, gold, platinum]

public class DiscountEligibility {
	public static void main(String[] args) {
		// 0 - silver; 1 - gold, 2 - platinum
		int card = 1;
		if(card == 0) {
			System.out.println("You are Silver card holder and eligible for 10% discount");
		}
		else if(card == 1) {
			System.out.println("You are Gold card holder and eligible for 15% discount");
		}
		else if(card == 2) {
			System.out.println("You are Platinum card holder and eligible for 25% discount");
		}
		else {
			System.out.println("You have to pay total amount");
		}
	}
}