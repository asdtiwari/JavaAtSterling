/* Find largest no. among 3 numbers [if largest numbers are equal then equal number should announce] */

public class LargestAmong3NO {
	public static void main(String[] args) {
		int num1 = 37;
		int num2 = 37;
		int num3 = 36;

		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("num1 (" + num1 + ") is greatest");
			}
			else if(num1 == num3) {
				System.out.println("num1, num3 (" + num1 + ") both are greater among all");
			}
			else {
				System.out.println("num3 (" + num3 + ") is greatest");
			}
		}
		else if(num1 == num2) {
			if(num1 > num3) {
				System.out.println("num1, num2 (" + num1 + ") both are greater among all");
			}
			else if(num1 == num3) {
				System.out.println("num1, num2, num3 (" + num1 + ") all are greater");
			}
			else {
				System.out.println("num3 (" + num3 + ") is greatest");
			}
		}
		else {
			if(num2 > num3) {
				System.out.println("num2 " + num2 + " is greatest");
			}
			else if(num2 == num3) {
				System.out.println("num2, num3 " + num2 + " both are greater among all");
			}
			else {
				System.out.println("num3 " + num3 + " is greatest");
			}
		}
	}
}