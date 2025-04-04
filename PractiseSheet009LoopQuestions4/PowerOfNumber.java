// Write a program to find the power of a number using for loop. 
public class PowerOfNumber {
	public static void main(String[] args) {
		int num = 3;
		int pow = 3;
		int ans = 1;
		for(int i = 0; i < pow; ++i) {
			ans *= num;
		}
		System.out.println(num + "^" + pow +" = " + ans);
	}
}