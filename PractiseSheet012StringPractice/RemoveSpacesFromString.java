/* WAP to remove spaces form a String "Java is a programming language and it is easy to learn" */
public class RemoveSpacesFromString {
	public static void main(String[] args) {
		String str = "Java    is a programming language an it is easy to learn";
		String[] words = str.split(" ");
		str = "";
		for(int i = 0; i < words.length; ++i) {
			str = str + words[i];
		}
		System.out.println("String after removing spaces \n" + str);
	}
}