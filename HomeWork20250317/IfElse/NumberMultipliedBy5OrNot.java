public class NumberMultipliedBy5OrNot {
	public static void main(String[] args) {
		int num = 10;
		if(num % 5 == 0) {
			System.out.println(num + " is divisible by 5");
		}
		else {
			System.out.println(num + " isn't divisible by 5");
		}
	}
}