/* Write a program in C to check whether an integer is Armstrong number or not. */
public class IsArmstrong {
	public static void main(String[] args) {
		int num = 153;
		if(num > 0) {
			int temp = num;
			// count digits;
			int count = 0;
			while(temp > 0) {
				++count;
				temp = temp / 10;
			}
			temp = num;
			int sum = 0;
			while(temp > 0) {
				int digit = temp % 10;
				int power = 1;
				for(int i = 0; i < count; ++i) {
					power = power * digit;
				}
				sum = sum + power;
				temp = temp / 10;
			}
			if(sum == num) {
				System.out.println(num + " is an Armstrong Number");
			} else {
				System.out.println(num + " is not an Armstrong Number");
			}
		} else {
			System.out.println("Enter a positive integer");
		}
	}
}