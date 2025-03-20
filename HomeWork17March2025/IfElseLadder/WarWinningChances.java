public class WarWinningChances {
	public static void main(String[] args) {
		int weapons = 40;
		if(weapons < 25) {
			System.out.println("Not sufficient equipments");
		}
		else if(weapons < 100) {
			System.out.println("May be shortage of equipments");
		}
		else {
			System.out.println("Higher possibilty of winning war");
		}
	}
}