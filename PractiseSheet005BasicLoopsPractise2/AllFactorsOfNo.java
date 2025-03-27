//  Write a program to find all factors of a number.
public class AllFactorsOfNo {
	public static void main(String[] args) {
		int num = 123;
		int fact = 1;
		System.out.println("Factors of " + num + " are ");
		while(fact <= num) {
			if(num % fact == 0) {
				System.out.print(fact + " ");
			}
			++fact;
		}
		System.out.println();
	}
}