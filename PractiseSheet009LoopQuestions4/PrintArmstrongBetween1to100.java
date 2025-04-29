/* Write a program to print all Armstrong numbers between 1 to 100. */
public class PrintArmstrongBetween1to100 {
	public static void main(String[] args) {
		int end = 1000;
		for(int num = 1; num < end; ++num) {

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
					System.out.println(num);
				}
			}
		}
	}
}