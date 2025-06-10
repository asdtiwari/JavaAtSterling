/* WAP to find Last occurrence of a word in a given string */
public class FindLastOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to find last occurrence of a word in a given string in Java";

		String key = "in";

		int lastIndexOfKey = str.lastIndexOf(key);

		System.out.println(str + '\n');
		if(lastIndexOfKey >= 0) {
			System.out.println("Last index of '" + key +  "' is " + lastIndexOfKey);
		} else {
			System.out.println(key + " is not present");
		}
	}
}