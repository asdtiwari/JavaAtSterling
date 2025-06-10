/* WAP to remove last occurrence of a word in a given string */
public class RemoveLastOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to remove last occurrence of a word in a given string in Java";

		String key = "in";
		String search = ' ' + key + ' ';

		int lastIndexOfKey = str.lastIndexOf(search);

		System.out.println(str + '\n');
		if(lastIndexOfKey >= 0) {
			System.out.print("After removing first occurrence of '" + key + "' : " + str.substring(0, lastIndexOfKey + 1) + str.substring(lastIndexOfKey + 1 + key.length()));
		} else {
			System.out.println(key + " is not present");
		}
	}
}