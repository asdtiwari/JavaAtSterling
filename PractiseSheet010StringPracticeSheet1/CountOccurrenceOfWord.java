/* WAP to count occurrence of a word in a given string */
public class CountOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to count occurrence of a word in a given string in Java";

		String key = "in";
		String search = ' ' + key + ' ';

		int indexOfKey = str.indexOf(search);

		System.out.println(str + '\n');
		if(indexOfKey >= 0) {
			int count = 0;
			while(indexOfKey >= 0) {
				++count;
				indexOfKey = str.indexOf(search, indexOfKey + 1);
			}
			System.out.println(key + " is present " + count + " times");
		} else {
			System.out.println(key + " is not present");
		}
	}
}