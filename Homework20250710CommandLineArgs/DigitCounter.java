// WAP to count the digits of given number using CLI
public class DigitCounter {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) < '0'|| word.charAt(i) > '9') {
						System.out.println("Enter digits only!!!");
						return;
					}
				}
			}

			for(String word : args) {
				int num = Integer.parseInt(word);
				int count = 0;
				for(int temp = num; temp > 0; temp /= 10, ++count);
				System.out.println(num + " has " + count + " digits.");	
			}
		} else {
			System.out.println("Re-execute the program and pass the integer values in CLI.");
		}
	}
}