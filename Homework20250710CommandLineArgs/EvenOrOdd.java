// WAP to check whether the given number using CLI is even or not
public class EvenOrOdd {
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
				if(num % 2 == 0) {
					System.out.println(num + " is even number");
				} else {
					System.out.println(num + " is odd number");
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer values in CLI.");
		}
	}
}