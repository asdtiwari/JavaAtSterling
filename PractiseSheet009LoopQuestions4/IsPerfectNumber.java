/* Write a program to check whether a number is Perfect number or not */
public class IsPerfectNumber {
	public static void main(String[] args) {
		int num = 6;
		if(num <= 0) {
			System.out.println("Enter a valid positive number");
		}
		else {
			int sumOfFactors = 0;
			for(int i = 1; i < num; ++i) {
				if(num % i == 0) {
					sumOfFactors = sumOfFactors + i;
				}
			}
			if(sumOfFactors == num) {
				System.out.println(num + " is Perfect Number");
			} else {
				System.out.println(num + " isn't Perfect Number");
			}
		}
	}
}