/* WAP to replace all lower case with "*" in String "Java is a Programming Language and it is Easy to Learn" */
public class ReplaceLowerCaseWithStar {
	public static void main(String[] args) {
		String str = "Java is a Programming Language and it is Easy to Learn";
		str = str.replaceAll("[a-z]", "*");
		System.out.println(str);
	}
}