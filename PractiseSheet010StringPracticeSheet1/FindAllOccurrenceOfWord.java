/* WAP to search all occurrence of a word in a given string */
public class FindAllOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to search all occurrence of a word in a given string in Java";

		String key = "in";
		String search = ' ' + key + ' ';

		int indexOfKey = str.indexOf(search);

		System.out.println(str + '\n');
		if(indexOfKey >= 0) {
			System.out.print(key + " is present at index: ");
			while(indexOfKey >= 0) {
				System.out.print((indexOfKey + 1) + " ");
				indexOfKey = str.indexOf(search, indexOfKey + 1);
			}
			System.out.println();
		} else {
			System.out.println(key + " is not present");
		}
	}
}