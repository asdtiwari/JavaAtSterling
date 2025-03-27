/* Write a program to find the power of a number */
public class PowerOfNumber {
	public static void main(String[] args) {
		int num = 12;
		int pow = 3;
		int ans = 1;
		for(int loop = 1; loop <= pow; ++loop) {
			ans *= num;
		}
		System.out.println(num + "^" + pow + " = " + ans);
	}
}