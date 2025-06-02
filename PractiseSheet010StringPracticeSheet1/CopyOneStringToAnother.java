/* Write a program to copy one string to another string */
public class CopyOneStringToAnother {
	public static void main(String[] args) {
		String str1 = "String1";
		String str2 = new String();

		int len = str1.length();
		for(int i = 0; i < len; ++i) {
			str2 = str2 + str1.charAt(i);
		}

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}
}