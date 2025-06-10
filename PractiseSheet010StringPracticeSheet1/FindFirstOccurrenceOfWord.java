/* WAP to find first occurrence of a word in a given string */
public class FindFirstOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to find first occurrence of a word in a given string";

		String key = "find";

		int indexOfKey = str.indexOf(key);

		System.out.println(str + '\n');
		if(indexOfKey >= 0) {
			System.out.println(key + " is present at index " + indexOfKey);
		} else {
			System.out.println(key + " is not present");
		}
	}
}