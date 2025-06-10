/* WAP to find last occurrence of a character in a given string. */
public class LastOccurenceOfGivenCharacter {
	public static void main(String[] args) {
		String str = "Java is high level, hibrid and mulitpurpose programming language; develped by James Goshling and his team at Sun Microsystem.";
		char key = 'a';
		System.out.println(str + '\n' + "Last occurence of \'" + key + "\' is at index " + str.lastIndexOf(key));
	}
}