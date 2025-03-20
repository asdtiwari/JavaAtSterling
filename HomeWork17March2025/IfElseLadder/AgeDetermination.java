public class AgeDetermination {
	public static void main(String[] args) {
		int age = 10;
		if(age < 13) {
			System.out.println("Infant");
		}
		else if(age < 20) {
			System.out.println("Teenager");
		}
		else {
			System.out.println("Adult");
		}
	}
}