// WAP to print the table of given number using CLI
public class PrintTable {
	public static void main(String[] args) {
		if(args.length == 1) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) < '0'|| word.charAt(i) > '9') {
						System.out.println("Enter digits only!!!");
						return;
					}
				}
			}
			int num = Integer.parseInt(args[0]);
			for(int i = 1; i <= 10; ++i) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		} else {
			System.out.println("Re-execute the program and pass only single integer value in CLI.");
		}
	}
}