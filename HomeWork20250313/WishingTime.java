// Wishing time conditional statement program
public class WishingTime {
	public static void main(String[] args) {
		int time = 17;
		if(time > 23) {
			System.out.println("Invalid hours");
		} else if(time > 14) {
			System.out.println("Good Evening");
		} else if(time > 11) {
			System.out.println("Good Afternoon");
		} else if(time > 5) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Greetings");
		}
	}
}
