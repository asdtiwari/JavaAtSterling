/* WAP to search all occurrence of a character in a given string. */
public class SearchAllOccurrenceOfGivenCharacter {
	public static void main(String[] args) {
		String str = "Java is high level, hibrid and mulitpurpose programming language; develped by James Goshling and his team at Sun Microsystem.";
		char key = 'a';
		System.out.print(str + '\n' + "Occurence of \'" + key + "\' is at index ");
		for(int i = 0, len = str.length(); i < len; ++i) {
			if(str.charAt(i) == key) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}