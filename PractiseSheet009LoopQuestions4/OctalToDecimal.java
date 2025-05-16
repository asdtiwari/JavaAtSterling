/* Write a program to convert Octal to Decimal number system. */
public class OctalToDecimal {
	public static void main(String[] args) {
		long octal = 10;
		long temp = octal;
		boolean isOctal = true;
		while(temp > 0) {
			if(temp % 10 >= 8) {
				isOctal = false;
				break;
			}
			temp = temp / 10;
		}
		
		if(isOctal) {
			System.out.println("Octal Number: " + octal);
			temp = octal;
			long decimal = 0;
			long powerOf8 = 1;
			while(temp > 0) {
				decimal = decimal + (temp % 10 * powerOf8);
				powerOf8 = powerOf8 * 8;
				temp = temp / 10;
			}
			System.out.println("Decimal form: " + decimal);					
		} else {
			System.out.println(octal + " is not an octal number");
		}
	}
}