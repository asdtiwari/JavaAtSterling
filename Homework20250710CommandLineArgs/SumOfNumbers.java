// WAP to add the given numbers using CLI and print the result
public class SumOfNumbers {
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
			long sum = 0;
			for(String word : args) {
				sum += Long.parseLong(word);
			}
			System.out.println("Sum is : " + sum);
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}