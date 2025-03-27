// Write a program to check whether a number is Strong number or not. 
public class IsStrongNo {
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while(temp > 0) {
			int factorial = 1;
			int digit = temp % 10;
			while(digit > 0) {
				factorial *= digit;
				--digit;
			}
			sum += factorial;
			temp /= 10;
		}
		if(sum == num) {
			System.out.println(num + " is Strong No.");
		}
		else {
			System.out.println(num + " is not a Strong No.");
		}
	}
}