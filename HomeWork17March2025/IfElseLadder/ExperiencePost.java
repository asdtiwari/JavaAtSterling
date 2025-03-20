public class ExperiencePost {
	public static void main(String[] args) {
		int experienceYear = 5;
		if(experienceYear < 3) {
			System.out.println("Junior Developer");
		}
		else if(experienceYear < 10) {
			System.out.println("Senior Developer");
		}
		else {
			System.out.println("Product Manager or higher post");
		}
	}
}