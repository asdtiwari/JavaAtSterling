/* WAP to remove all "i" from String "Java is a programming language and it is easy to learn" */
public class RemoveCharacterFromString {
	public static void main(String[] args) {
		String str = "Java is a programming languages and it is easy to learn";
		String ans = "";
		for(int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			if(ch != 'i') {
				ans = ans + ch;
			}
		}
		System.out.println(ans);
	}
}