/* Write a program to convert Octal to Binary number system. */
public class OctalToBinary {
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
			temp = decimal;
			long binary = 0L;
			long mulitpleOf10 = 1;
			while(temp > 0) {
				binary = binary + (temp % 2) * mulitpleOf10;
				mulitpleOf10 = mulitpleOf10 * 10;
				temp = temp / 2;
			}
			System.out.println("Binary form: " + binary);					
		} else {
			System.out.println(octal + " is not an octal number");
		}
	}
}