// WAP to add the given even and odd numbers using CLI seperately
public class SeperateSumOfEvenAndOdd {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) != '-' && word.charAt(i) < '0'|| word.charAt(i) > '9') {
						System.out.println("Enter digits only!!!");
						return;
					}
				}
			}
			long evenSum = 0;
			long oddSum = 0;
			for(String word : args) {
				long num = Long.parseLong(word);
				if(num % 2 == 0) {
					evenSum += num;
				} else {
					oddSum += num;
				}
			}
			System.out.println("Even sum is: " + evenSum + "\n" + "Odd Sum is: " + oddSum);
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}