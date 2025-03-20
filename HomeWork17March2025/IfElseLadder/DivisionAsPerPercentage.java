public class DivisionAsPerPercentage {
	public static void main(String[] args) {
		double percentage = 50;
		if(percentage < 33) {
			System.out.println("F grade");
		}
		else if(percentage < 50) {
			System.out.println("E grade");
		}
		else if(percentage < 65) {
			System.out.println("D grade");
		}
		else if(percentage < 75) {
			System.out.println("C grade");
		}
		else if(percentage < 85) {
			System.out.println("B grade");
		}
		else {
			System.out.println("A grade");
		}
	}
}