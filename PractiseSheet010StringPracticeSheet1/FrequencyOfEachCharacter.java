/* Write a Program to count freqency of each character in a string. */
public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		String str = "Java is Hybrid, High Level, Multipurpose programming language; developed by James Gosling and his team at Sun Microsystem in 1995.";

		System.out.println(str + "\n\n" + "Frequncy of characters");

		for(char i = 0; i < 256; ++i) {
			int currentFreq = 0;
			for(int j = 0, len = str.length(); j < len; ++j) {
				if(str.charAt(j) == i) {
					++currentFreq;
				}
			}
			if(currentFreq > 0) {
				System.out.println(i + " : " + currentFreq);
			}
		}
	}
}