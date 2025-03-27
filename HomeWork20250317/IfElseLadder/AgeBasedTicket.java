// Age based ticket in bus
public class AgeBasedTicket {
	public static void main(String[] args) {
		int age = 5;
		if(age <= 5) {
			System.out.println("Hey kid, you can travel freely");
		}
		else if(age <= 12) {
			System.out.println("Hey child, you have to pay for half ticket");
		}
		else if(age <= 60) {
			System.out.println("Pay the total amount to travel");
		}
		else {
			System.out.println("Hello senior citizen, you have to pay only half ticket");
		}
	}
}