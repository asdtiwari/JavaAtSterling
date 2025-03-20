public class ClassOfSociety {
	public static void main(String[] args) {
		long yearlyIncome = 100000;
		if(yearlyIncome < 250000) {
			System.out.println("Lower Class Family");
		} 
		else if(yearlyIncome < 1000000) {
			System.out.println("Middle Class Family");
		}
		else {
			System.out.println("Higher Class Family");
		}
	}
}