/* Write a program to convert Decimal to Octal number system. */
public class DecimalToOctal {
	public static void main(String[] args) {
		long decimal = 8;
		long temp = decimal;
		long octal = 0;
		long multipleOf10 = 1;
		while(temp > 0) {
			octal = octal + (temp % 8 * multipleOf10);
			multipleOf10 = multipleOf10 * 10;
			temp = temp / 8;
		}
		System.out.println("Decimal: " + decimal + "\n" + "Octal " + octal);
	}
}