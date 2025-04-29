/* Write a program to find one's complement of a binary number. */
public class OnesComplementOfBinaryNumber {
	public static void main(String[] args) {
		long num = 1110101010101L; 

		// validate binary number
		long temp = num;
		boolean isBinary = true;
		while(temp > 0) {
			if(temp % 10 > 1) {
				isBinary = false;
				break;
			}
			temp = temp / 10;
		}

		if(isBinary) {
			// now ones complement
			temp = 0;
			long multiple = 1;
			while(num > 0) {
				// fetching unit digit
				long rem = num % 10;

				// toggling bits
				if(rem == 0) {
					rem = 1;
				} else {
					rem = 0;
				}
				
				temp = temp + (rem * multiple);
				multiple = multiple * 10;
				num = num / 10;
			}
			System.out.println(temp);
		} else {
			System.out.println("Invalid binary number");
		}
	}
}