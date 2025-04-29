/* Write a program to convert Binary to Octal number system. */

public class BinaryToOctal {
	public static void main(String[] args) {

		long num = 1010101010101111110L;
		long ans = 1;

		boolean isBinary = true;
		long temp = num;
		while(temp > 0) {
			if(temp % 10 > 1) {
				isBinary = false;
				break;
			}
			temp = temp / 10;
		}

		if(isBinary) {
			// binary to decimal
			temp = 0;
			long multiply = 1;
			while(num > 0) {
				temp = temp + (num % 10 * multiply);
				multiply = multiply * 2;
				num = num / 10;
			}

			// decimal to octal
			num = 0;
			multiply = 1;
			while(temp > 0) {
				num = num + (temp % 8 * multiply);
				multiply = multiply * 10;
				temp = temp / 8;
			}

			System.out.println(num);
		} else {
			System.out.println("Invalid number");
		}
	}
}