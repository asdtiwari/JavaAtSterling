/* WAP to remove all occurrence of a word in a given string */
public class RemoveAllOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to all occurrence of a word in a given string in Java";

		String key = "in";
		String search = ' ' + key + ' ';

		int lastIndexOfKey = str.lastIndexOf(search);

		System.out.println(str + '\n');
		if(lastIndexOfKey >= 0) {
			System.out.print("After removing all occurrence of '" + key + "' : " + str.replace(search, "  "));
		} else {
			System.out.println(key + " is not present");
		}
	}
}