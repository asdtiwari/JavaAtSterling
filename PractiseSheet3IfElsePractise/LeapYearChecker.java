// Leap year checker using nested if - else

public class LeapYearChecker {
	public static void main(String[] args) {
		int year = 1972;
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.println(year + " is a leap year");
			}
			else {
				System.out.println(year + " is not a leap year");
			}
		}
		else {
			if(year % 4 == 0) {
				System.out.println(year + " is a leap year");
			}
			else {
				System.out.println(year + " is not a leap year");
			}
		}
	}
}