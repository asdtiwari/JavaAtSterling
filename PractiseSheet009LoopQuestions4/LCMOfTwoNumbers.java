/* Write a program to find LCM(Lowest Common Multiple) of two numbers. */
public class LCMOfTwoNumbers {
	public static void main(String[] args) {
		int num1 = 21;
		int num2 = 17;

		// to ensure the smaller number should be in num2
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = num1;
		}

		int lcm = 1;
		int i = 2;
		while(i <= num2) {
			if(num1 % i == 0) {
				if(num2 % i == 0) {
					num1 = num1/i;
					num2 = num2 / i;
					lcm = lcm * i;
				}
				else {
					++i;
				}
			}
			else {
				++i;
			}
		}
		lcm = lcm * num1 * num2;
		System.out.println("LCM is : " + lcm);
	}
}