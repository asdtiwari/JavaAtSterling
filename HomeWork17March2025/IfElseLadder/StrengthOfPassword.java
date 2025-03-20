public class StrengthOfPassword {
	public static void main(String[] args) {
		int lenOfPassword = 5;
		if(lenOfPassword < 4) {
			System.out.println("Very Weak Password");
		}
		else if(lenOfPassword < 8) {
			System.out.println("Medium Password Strength");
		}
		else {
			System.out.println("Strong Password");
		}
	}
}