/* Write a program to find two's complement of a binary number. */
public class FindTwosComplementOfBinaryNumber {
	public static void main(String[] args) {
		long num = 10110101010101L;

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

			// converting to 2's complement
			num = 0;
			long carry = 1;
			multiple = 1;
			while(temp > 0) {
				long rem = temp % 10;
				if(rem == 1) {
					if(carry == 1) {
						rem = 0;
					} else {
						rem = 1;
						carry = 0;
					}
				} else if(carry == 1) {
					rem = 1;
					carry = 0;
				}
				num = num + (rem * multiple);
				multiple = multiple * 10;
				temp = temp / 10;
			}

			System.out.println(num);
		} else {
			System.out.println("Invalid binary number");
		}
	}
}
