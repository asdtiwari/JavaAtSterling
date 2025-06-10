/* Write a Program to reverse a String "Java is a programming language and it is easy to learn" */
public class ReverseString {
	public static void main(String[] args) {

		String str = "Java is a programming language and it is easy to learn";
		System.out.println("Before reversed \n" + str);

		String rev = "";
		for(int i = str.length() - 1; i >= 0; --i) {
			rev = rev + str.charAt(i);
		}
		System.out.println("After reversed \n" + rev);
	}
}