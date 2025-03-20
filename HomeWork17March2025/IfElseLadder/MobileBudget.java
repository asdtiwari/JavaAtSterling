public class MobileBudget {
	public static void main(String[] args) {
		int budget = 10000;
		if(budget < 10000) {
			System.out.println("You can purchase Xiaomi or Raelme");
		}
		else if(budget < 50000) {
			System.out.println("You can purchase Samsung");
		}
		else {
			System.out.println("You can purchase Apple");
		}
	}
}