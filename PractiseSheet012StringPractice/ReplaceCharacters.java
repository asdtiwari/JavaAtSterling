/* Write a program to replace "a" with "*" in "Java is a programming language and it is easy to learn" */
public class ReplaceCharacters {
	public static void main(String[] args) {
		String str = "Java is a programming language and it is easy to learn";
		str = str.replace('a', '*');
		System.out.println("After replaceing a with * \n" + str);
	}
}