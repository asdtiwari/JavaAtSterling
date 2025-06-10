/* Write a Program to find highest freqency character in a string. */
public class HighestFrequencyCharacter {
	public static void main(String[] args) {
		String str = "Java is Hybrid, High Level, Multipurpose programming language; developed by James Gosling and his team at Sun Microsystem in 1995.";
		int freq = 0;
		char ch = ' ';

		// considering 256 characters only
		for(char i = 0; i < 256; ++i) {
			int currentFreq = 0;
			for(int j = 0, len = str.length(); j < len; ++j) {
				if(str.charAt(j) == i) {
					++currentFreq;
				}
			}
			if(currentFreq > freq) {
				ch = i;
				freq = currentFreq;
			}
		}

		System.out.println(str + "\n\n" + "Highest Frequncy \n\'" + ch + "\' with having " + freq + " frequency");
	}
}