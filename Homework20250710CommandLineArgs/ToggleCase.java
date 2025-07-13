// WAP to toggle the case of given string using CLI
public class ToggleCase {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				String str = "";
				for(int i = 0, len = word.length(); i < len; ++i) {
					char ch = word.charAt(i);
					if(ch >= 'A') {
						if(ch <= 'Z') {
							ch = (char)(ch + 32);
						} else if(ch >= 'a') {
							if(ch <= 'z') {
								ch = (char)(ch - 32);
							}
						}
					}
					str = str + ch;
				}
				System.out.println(word + " ----> " + str);
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}