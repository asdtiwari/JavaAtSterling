// WAP to check which one of the given numbers using CLI is maximum
public class MaximumNumber {
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

			int max = Integer.parseInt(args[0]);
			for(String word : args) {
				int num = Integer.parseInt(word);
				if(max < num) {
					max = num;
				}
			}
			System.out.println(max + " is the maximum number.");
		} else {
			System.out.println("Re-execute the program and pass the integer values in CLI.");
		}
	}
}