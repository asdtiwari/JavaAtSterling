/* WAP to replace all lowercase with uppercase and vice versa in String "Java is a Programming Language and it is Easy to Learn" */
public class ToggleCase {
	public static void main(String[] args) {
		String str = "Java is a Programming Language and it is Easy to Learn";
		char[] strArray = str.toCharArray();
		char diff = 'a' - 'A';
		for(int i = 0; i < strArray.length; ++i) {
			if(strArray[i] >= 'a') {
				if(strArray[i] <= 'z') {
					strArray[i] = (char)(strArray[i] - diff);
				}
			} else if(strArray[i] >= 'A') {
				if(strArray[i] <= 'Z') {
					strArray[i] = (char)(strArray[i] + diff);
				}
			}
		}
		str = new String(strArray);
		System.out.println(str);
	}
}