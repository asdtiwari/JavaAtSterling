//  Write a program to find the power of a number.
public class PowerOfNo {
	public static void main(String[] args) {
		int num = 12;
		int pow = 3;
		int ans = 1;
		System.out.print(num + "^" + pow + " is: ");
		while(pow > 0) {
			ans *= num;
			--pow;
		}
		System.out.println(ans);
	}
}