/* WAP to trim leading white space characters from given String. */
public class TrimLeadingWhiteSpace {
	public static void main(String[] arg) {
		String str = "               Write a program to trim leading white space characters form given String.";

		System.out.println(str);

		int i = 0;
		while(str.charAt(i) == ' ') {
			++i;
		}

		System.out.println(str.substring(i));
	}
}
