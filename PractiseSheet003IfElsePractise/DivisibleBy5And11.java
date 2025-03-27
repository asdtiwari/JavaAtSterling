// Write a program to check whether a number is divisible by 5 and 11 or not
public class DivisibleBy5And11 {
	public static void main(String[] args) {
		int num = 55;
		if(num % 5 == 0) {
			if(num % 11 == 0) {
				System.out.println(num + " is divisible by 11 and 5");
			}
			else {
				System.out.println("Not divisible by 5 and 11");
			}
		}
		else {
			System.out.println("Not divisible by 5 and 11");
		}
	}
}