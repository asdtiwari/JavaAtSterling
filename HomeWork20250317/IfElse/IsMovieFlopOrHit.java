public class IsMovieFlopOrHit {
	public static void main(String[] args) {
		long budget = 1000000;
		long boxOffice = 1000000;
		if(boxOffice < budget) {
			System.out.println("flop movie");
		}
		else {
			System.out.println("Hit movie");
		}
	}
}