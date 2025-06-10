/* WAP to remove all extra blank spaces from given String */
public class RemoveAllExtraBlankSpaces {
	public static void main(String[] args) {
		String str = "    Write a program      to remove    all extra     blank spaces from            given String     ";
		System.out.println(str);
		System.out.println(str.trim().replaceAll("\\s+", " "));
	}
}