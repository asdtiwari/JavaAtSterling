/* WAP to check whether a number is Armstrong number or not */
public class IsArmstrong {
	public static void main(String[] args) {
		int num = 153;

		if(num <= 0) {
			System.out.println("Enter a valid number");
		} else {
	
			// count digits
			int temp = num;
			int count = 0;
			while(temp > 0) {
				++count;
				temp = temp / 10;
			}

			// checking armstrong
			temp = num;
			int sum = 0;
			while(temp > 0) {
				int digit = temp % 10;

				int power = 1;
				// int digit to the power count
				for(int i = 0; i < count; ++i) {
					power *= digit;
				}
				
				// sum the power
				sum = sum + power;

				temp = temp / 10;
			}
			if(sum == num) {
				System.out.println("Given number is Armstrong");
			} else {
				System.out.println("Given number is not Armstrong");
			}
		}
	}
}