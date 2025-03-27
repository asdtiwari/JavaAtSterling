/* Write a program to find all factors of a number */
public class FactorsOfNumber {
	public static void main(String[] args) {
		int num = 1024;
		for(int fact = 1; fact <= num; ++fact) {
			if(num % fact == 0) {
				System.out.println(fact);
			}
		}
	}
}