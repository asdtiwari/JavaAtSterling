public class ConsequencesOfEarthQuake {
	public static void main(String[] args) {
		double richterScale = 7;
		if(richterScale < 3) {
			System.out.println("Least probability of Cyclone");
		}
		else if(richterScale < 6) {
			System.out.println("Most probability of Cyclone");
		}
		else {
			System.out.println("Highest Probability of Cyclone");
		}
	}
}