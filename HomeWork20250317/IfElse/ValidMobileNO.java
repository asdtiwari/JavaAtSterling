public class ValidMobileNO{
	public static void main(String[] args) {
		long number = 9876543210L; 
		if(number < 6000000000L) {
			System.out.println("Not a valid number");
		}
		else if(number > 100000000000L) {
			System.out.println("Not a valid number");
		}
		else {
			System.out.println("Valid Number");
		}
	}
}
