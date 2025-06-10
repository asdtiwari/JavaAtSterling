public class FrequencyOfAlphabetsDigitsSpecialCharacter {
	public static void main(String[] args) {
		String str = "Akhilesh Tiwari is an engineering student, pursuing his degree from Medicaps University, Indore. He is working to get a noted job in computer science field.";

		int alphabetFreq = 0;
		int digitFreq = 0;
		int characterFreq = 0;

		for(int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			if(ch >= 'a') {
				if(ch <= 'z') {
					++alphabetFreq;
				} else {
					++characterFreq;
				}
			} else if(ch >= 'A') {
				if(ch <= 'Z') {
					++alphabetFreq;
				} else {
					++characterFreq;
				}
			} else if(ch >= '0') {
				if(ch <= '9') {
					++digitFreq;
				} else {
					++characterFreq;
				}
			} else {
				++characterFreq;
			}
		}

		System.out.println("In the given paragraph: " + str + "\n\n" + "Frequency of:" + "\n Special Characters: " + characterFreq + "\n Digits: " + digitFreq + "\n Alphabets: " + alphabetFreq);
	}
}