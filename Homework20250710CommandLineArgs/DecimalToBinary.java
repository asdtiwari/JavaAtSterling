// WAP to convert the given decimal number using CLI in binary format
public class DecimalToBinary {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(0) != '-' && word.charAt(i) < '0'|| word.charAt(i) > '9') {
						System.out.println("Enter valid numbers!!!");
						return;
					}
				}
			}
			for(String word : args) {
				long num = Long.parseLong(word);
				String binary = num == 0 ? "0" : "";
				while(num != 0) {
					long bit = num & 1;
					binary = bit + binary;
					num = num >>> 1;
				}
				System.out.println(word + " into binary will be " + binary);
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}