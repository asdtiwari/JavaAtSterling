// WAP to count total number of vowels and consonants in a string
public class FrequencyOfVowelsConsonants {
	public static void main(String[] args) {
		String str = "Akhilesh Tiwari is an engineering student, pursuing his degree from Medicaps University, Indore. He is working to get a noted job in computer science field.";

		int vowelFreq = 0;
		int consonantFreq = 0;
		int len = str.length();
		int i = 0;
		while(i < len) {
			char ch = str.charAt(i);
			if(ch >= 'a') {
				if(ch <= 'z') {
					if(ch == 'a') {
						++vowelFreq;
					} else if(ch == 'e') {
						++vowelFreq;
					} else if(ch == 'i') {
						++vowelFreq;
					} else if(ch == 'o') {
						++vowelFreq;
					} else if(ch == 'u') {
						++vowelFreq;
					} else {
						++consonantFreq;
					}
				}
			} else if(ch >= 'A') {
				if(ch <= 'Z') {
					if(ch == 'A') {
						++vowelFreq;
					} else if(ch == 'E') {
						++vowelFreq;
					} else if(ch == 'I') {
						++vowelFreq;
					} else if(ch == 'O') {
						++vowelFreq;
					} else if(ch == 'U') {
						++vowelFreq;
					} else {
						++consonantFreq;
					}
				}
			}
			++i;
		}

		System.out.println("In the given paragraph: " + str + "\n\n" + "Frequency of:" + "\n Vowels: " + vowelFreq + "\n Consonant: " + consonantFreq);

	}
}