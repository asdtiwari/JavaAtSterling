// WAP to convert the given binary string using CLI in Decimal format
public class BinaryToDecimal {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) < '0'|| word.charAt(i) > '1') {
						System.out.println("Enter valid binary format!!!");
						return;
					}
				}
			}
			for(String word : args) {
				long num = 0;
				for(int i = 0, len = word.length(); i < len; ++i) {
					int bit = word.charAt(i) - '0';
					num = num << 1;
					num = num | bit;
				}
				System.out.println(word + " into decimal will be " + num);
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}