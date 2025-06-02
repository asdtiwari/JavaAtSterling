/* WAP to concatenate two string */
public class ConcatenateTwoStrings {
	public static void main(String[] args) {
		String str1 = "Amar";
		String str2 = "jeet";
		String concatStr = str1 + str2;
		String concatStrUsingFn = str1.concat(str2);
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("concatStr: " + concatStr);
		System.out.println("concatStrUsingFn: " + concatStrUsingFn);
	}
}