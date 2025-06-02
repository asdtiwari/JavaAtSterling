/* Write a Program to reverse a String "Java is a programming language and it is easy to learn" */
public class ReverseString {
	public static void main(String[] args) {
		String str = "Java is a programming language and it is easy to learn";
		System.out.println("Before reversed \n" + str);
		char[] strArr = str.toCharArray();
		for(int i = 0, end = strArr.length / 2; i < end; ++i) {
			char temp = strArr[i];
			strArr[i] = strArr[strArr.length - 1 - i];
			strArr[strArr.length - 1 - i] = temp;
		}
		str = new String(strArr);
		System.out.println("After reversed \n" + str);
	}
}