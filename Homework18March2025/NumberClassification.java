// Number classification [positive even, positive odd, negative even, negative odd, zero]

public class NumberClassification {
	public static void main(String[] args) {
		int num = 0;
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println(num + " is positive even number");
			}
			else {
				System.out.println(num + " is positive odd number");
			}
		}
		if(num < 0) {
			if(num % 2 == 0) {
				System.out.println(num + " is negative even number");
			}
			else {
				System.out.println(num + " is negative odd number");
			}
		}
		else {
			System.out.println(num + " is zero ");
		}
	}
}