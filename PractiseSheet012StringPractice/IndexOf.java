/* WAP to check the index of g in String "Java is a Programming language and it is easy to learn" */
public class IndexOf {
	public static void main(String[] args) {
		String str = "Java is a Programming language and it is easy to learn";
		System.out.println(str);
		System.out.print("g is present at index ");
		for(int i = 0, len = str.length(); i < len; ++i) {
			if(str.charAt(i) == 'g') {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}