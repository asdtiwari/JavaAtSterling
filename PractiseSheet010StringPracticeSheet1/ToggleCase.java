/* WAP to replace all lowercase with uppercase and vice versa in String "Java is a Programming Language and it is Easy to Learn" */
public class ToggleCase {
	public static void main(String[] args) {
		String str = "Java is a Programming Language and it is Easy to Learn";

		String toggleCase = "";
		char diff = 'a' - 'A';
		for(int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			if(ch >= 'a') {
				if(ch <= 'z') {
					toggleCase = toggleCase + (char)(ch - diff);
				} else {
					toggleCase = toggleCase + ch;
				}
			} else if(ch >= 'A') {
				if(ch <= 'Z') {
					toggleCase = toggleCase + (char)(ch + diff);
				} else {
					toggleCase = toggleCase + ch;
				}
			} else {
				toggleCase = toggleCase + ch;
			}
		}
		System.out.println(toggleCase);
	}
}