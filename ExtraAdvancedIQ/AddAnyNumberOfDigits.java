// WAP to add any number of digits

import java.util.Scanner;

public class AddAnyNumberOfDigits {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first No.: ");
		String num1 = scan.nextLine();
		int num1Length = num1.length();

		System.out.print("Enter Second No.: ");
		String num2 = scan.nextLine();
		int num2Length = num2.length();

		int sumLength = num1Length > num2Length ? num1Length + 1 : num2Length + 1;
		char[] finalSum = new char[sumLength];

		int carry = 0;
		int i = num1Length - 1;
		int j = num2Length - 1; 
		while(i >= 0 && j >= 0) {
			int sum = carry + (num1.charAt(i) - '0') + (num2.charAt(j) - '0');
			finalSum[--sumLength] = (char)('0' + (sum % 10));
			carry = sum / 10;
			--i;
			--j;
		}

		while(i >= 0) {
			int sum = carry + (num1.charAt(i) - '0');
			finalSum[--sumLength] = (char)('0' + (sum % 10));
			carry = sum / 10;
			--i;
		}

		while(j >= 0) {
			int sum = carry + (num2.charAt(j) - '0');
			finalSum[--sumLength] = (char)('0' + (sum % 10));
			carry = sum / 10;
			--j;
		}
		
		if(carry > 0) {
			finalSum[--sumLength] = (char)('0' + carry);
		}

		System.out.println("Sum is: " + (new String(finalSum, sumLength, finalSum.length - sumLength)));
		scan.close();
	}
}