public class StateOfWater {
	public static void main(String[] args) {
		double tempOfWater = 10;
		if(tempOfWater < 0) {
			System.out.println("Ice");
		}
		else if(tempOfWater < 100) {
			System.out.println("Liquid");
		}
		else {
			System.out.println("Vapour");
		}
	}
}