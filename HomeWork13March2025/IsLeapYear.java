// leap year conditional statement program
public class IsLeapYear {
	public static void main(String[] args) {
		int year = 1972;
		if(year % 100 == 0) {
			if(year % 400 == 0 ) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not a Leap Year");
			}
		} else if(year % 4 == 0 ) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}
}