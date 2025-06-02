/* WAP to remove all "i" from String "Java is a programming language and it is easy to learn" */
public class RemoveCharacterFromString {
	public static void main(String[] args) {
		String str = "Java is a programming languages and it is easy to learn";
		String[] strArr = str.split("i");
		str = "";
		for(int i = 0; i < strArr.length; ++i) {
			str = str + strArr[i];
		}
		System.out.println(str);
	}
}