// WAP to get a number and its power using CLI and return the answer after evaluation
public class PowerOfNumber {
	public static void main(String[] args) {
		if(args.length == 2) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) != '-' && word.charAt(i) < '0' || word.charAt(i) > '9') {
						System.out.println("Enter digits only!!!");
						return;
					}
				}
			}
			int num = Integer.parseInt(args[0]);
			int pow = Integer.parseInt(args[1]);
			System.out.println(num + "^" + pow + " = " + Math.pow(num, pow));
		} else {
			System.out.println("Re-execute the program and pass only two integer values in CLI.");
		}
	}
}