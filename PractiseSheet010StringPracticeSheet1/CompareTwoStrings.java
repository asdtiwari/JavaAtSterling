// WAP to compare two strings
public class CompareTwoStrings {
	public static void main(String[] args) {
		String str1 = "Akhilesh Tiwari";
		String str2 = "Aeshna Preyasi";

		int ans = str1.compareTo(str2);
		if(ans < 0) {
			System.out.println(str1 + " is lexicographically smaller than " + str2);
		} else if(ans == 0) {
			System.out.println(str1 + " is same as " + str2);
		} else {
			System.out.println(str2 + " is lexicographically smaller than " + str1);
		}
	}
}
		