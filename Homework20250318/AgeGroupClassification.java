// Age group classification

public class AgeGroupClassification {
	public static void main(String[] args) {
		int age = 12;
		if(age < 13) {
			System.out.println("Infant");
		}
		else if(age < 20) {
			System.out.println("Teenagers");
		}
		else if(age < 60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}
	}
}