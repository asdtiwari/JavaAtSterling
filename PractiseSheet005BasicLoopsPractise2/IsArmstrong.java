//  Write a program to check whether a number is Armstrong number or not.

public class IsArmstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int digits = 0;
		// count digits
		while(temp > 0) {
			++digits;
			temp /= 10;
		}
		temp = num;
		int sum = 0;
		while(temp > 0) {
			int pow = 1;
			int i = 0;
			// power of digits
			while(i < digits) {
				pow *= temp % 10;
				++i;
			}
			sum += pow;
			temp /= 10;
		}
		if(sum == num) {
			System.out.println(num + " is an Armstrong No.");
		}
		else {
			System.out.println(num + " is not an Armstrong No.");
		}
	}
}