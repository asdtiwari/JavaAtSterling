/* Write a program to convert Decimal to Binary number system. */
public class DecimalToBinary {
	public static void main(String[] args) {
		long decimal = 10;
		long temp = decimal;
		long binary = 0;
		long mulitpleOf10 = 1;
		while(temp > 0) {
			binary = binary + (temp % 2) * mulitpleOf10;
			mulitpleOf10 = mulitpleOf10 * 10;
			temp = temp / 2;
		}
		System.out.println("Binary form: " + binary);
	}
}