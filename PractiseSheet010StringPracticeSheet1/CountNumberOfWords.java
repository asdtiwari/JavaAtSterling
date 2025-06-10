// WAP to count total number of words in a string 
public class CountNumberOfWords {
	public static void main(String[] args) {
		String str = "   Akhilesh    Tiwari is an engineering student, pursuing his degree from   Medicaps University , Indore.He is working to get a noted job in computer science field.";

		int wordFreq = 0;
		int i = 0; 
		int len = str.length(); 
		while(i < len) {
			char ch = str.charAt(i);
			boolean isChar = false;
			if(ch >= 'a') {
				if(ch <= 'z') {
					isChar = true;
				}
			} else if(ch >= 'A') {
				if(ch <= 'Z') {
					isChar = true;
				}
			}

			if(isChar) {
				++wordFreq;
				while(i < len) {
					ch = str.charAt(i);
					if(ch < 'A') {
						break;
					} else if(ch > 'Z') {
						if(ch < 'a') {
							break;
						}
					} else if(ch > 'z') {
						break;
					}
					++i;
				}
			} else {
				++i;
			}					
		}
		System.out.println("In the given paragraph: " + str + "\n\n" + "Frequency of words: " + wordFreq);

	}
}
