/* WAP to remove all repeated characters from a given string */
public class RemoveAllRepeatedCharacters {
	public static void main(String[] args) {
		String str = "Write a program to remove all repeated characters from a given string.";

		char replace = 0;
		System.out.println("Original String : " + str + '\n');
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			str = str.substring(0, i + 1) + str.substring(i + 1, str.length()).replace(ch, replace);
		}

		System.out.println("After removing repeated characters : " + str);
	}
}