public class TrainTicketAvailability {
	public static void main(String[] args) {
		int availableSeat = 255;
		if(availableSeat > 0) {
			System.out.println("Current availability is " + availableSeat);
		}
		else {
			System.out.println("Unavailable, please check for next date or route");
		}
	}
}