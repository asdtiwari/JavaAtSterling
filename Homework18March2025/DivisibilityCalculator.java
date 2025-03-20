// Divisibility calculator [dividend / divisor; input: dividend and divisor; output: divisible or not]

public class DivisibilityCalculator {
	public static void main(String[] args) {
		int dividend = 35;
		int divisor = 7;
		if(dividend % divisor == 0) {
			System.out.println("Completely Divisible");
		}
		else {
			System.out.println("Not Completely Divisible");
		}
	}
}