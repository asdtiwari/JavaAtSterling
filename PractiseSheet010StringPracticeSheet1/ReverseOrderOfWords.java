// WAP to reverse order of words in a given string
public class ReverseOrderOfWords {
	public static void main(String[] args) {
		String str = "This is Java Programming Languages, it is considered as one of the most secure language in the world. It is about 95% Object oriented.";

		int i = 0;
		int len = str.length();
		int j = len - 1;

		String ans = "";

		while(j >= 0) {
			int k = str.lastIndexOf(' ', j);
			if(k >= 0) {
				ans = ans + str.substring(k, j + 1);
			} else {
				ans = ans + " " + str.substring(0, j + 1);
			}
			j = k - 1;
		}
		System.out.println("Given String: " + str);
		System.out.println("\n" + "Output String: " + ans);
	}
}