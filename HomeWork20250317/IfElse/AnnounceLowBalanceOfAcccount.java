public class AnnounceLowBalanceOfAcccount {
	public static void main(String[] args) {
		double balance = 100000;
		if(balance < 1000) {
			System.out.println("Very Low Balance, can expose penalty");
		}
		else {
 			System.out.println("Sufficient amount");
		}
	}
}