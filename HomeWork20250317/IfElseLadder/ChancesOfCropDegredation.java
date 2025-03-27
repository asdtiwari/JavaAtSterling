public class ChancesOfCropDegredation {
	public static void main(String[] args) {
		double chemicalPercentage = 24;
		if(chemicalPercentage < 25) {
			System.out.println("Least Probability of degradation");
		}
		else if(chemicalPercentage < 50) {
			System.out.println("More chances of degradation");
		}
		else {
			System.out.println("Crop will degrade");
		}
	}
}