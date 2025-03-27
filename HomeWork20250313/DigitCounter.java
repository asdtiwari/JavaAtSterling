// digit counter conditional statement program
public class DigitCounter {
	public static void main(String[] args) {
		int num = 555;
		if(num > 2147483647) {
			System.out.println("Beyond the program's range");
		} else if(num > 1000000000) {
			System.out.println("Ten digits");
		} else if(num > 100000000) {
			System.out.println("Nine digits");
		} else if(num > 10000000) {
			System.out.println("Eight digits");
		} else if(num > 1000000) {
			System.out.println("Seven digits");
		} else if(num > 100000) {
			System.out.println("Six digits");
		} else if(num > 10000) {
			System.out.println("Five digits");
		} else if(num > 1000) {
			System.out.println("Four digits");
		} else if(num > 100) {
			System.out.println("Three digits");
		} else if(num > 10) {
			System.out.println("Two digits");
		} else if(num > 0) {
			System.out.println("One digit");
		} else {
			System.out.println("Negative number, try again with positive number");
		}
	}
}