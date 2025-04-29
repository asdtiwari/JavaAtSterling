/* Write a program to check whether a number is Strong number or not. */
public class IsStrongNumber {
	public static void main(String[] args) {
		int num = 145;
		if(num <= 0) {
			System.out.println("Enter a positive valid integer");
		} else {
			int temp = num;
			int sum = 0;
			while(temp > 0) {
				int digit = temp % 10;
				int factorial = 1;
				for(int i = digit; i > 0; --i) {
					factorial = factorial * i;
				}
				sum = sum + factorial;
				temp = temp / 10;
			}
			if(sum == num) {
				System.out.println(num + " is Strong number");
			} else {
				System.out.println(num + " isn't Strong number");
			}

		}
	}
}