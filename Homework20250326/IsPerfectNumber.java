/* Write a program to check whether a number is Perfect number or not. */
public class IsPerfectNumber {
	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		for(int loop = 1; loop <= num / 2; ++loop) {
			if(num % loop == 0) {
				sum += loop;
			}
		}
		if(sum == num) {
			System.out.println(num + " is Perfect number");
		}
		else {
			System.out.println(num + " is not a Perfect number");
		}
	}
}