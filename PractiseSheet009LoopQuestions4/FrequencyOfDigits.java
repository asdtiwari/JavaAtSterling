// Write a program to find frequency of each digit in a given integer. 
public class FrequencyOfDigits {
	public static void main(String[] args) {
		int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
		int number = 1234554;
		int num = number;
		while(num > 0) {
			int digit = num % 10;
			if(digit == 0) {
				++zero;
			}
			else if(digit == 1) {
				++one;
			}
			else if(digit == 2) {
				++two;
			}
			else if(digit == 3) {
				++three;
			}
			else if(digit == 4) {
				++four;
			}
			else if(digit == 5) {
				++five;
			}
			else if(digit == 6) {
				++six;
			}
			else if(digit == 7) {
				++seven;
			}
			else if(digit == 8) {
				++eight;
			}
			else if(digit == 9) {
				++nine;
			}
			num /= 10;
		}

		System.out.println("Frequency of digits in " + number + "\n zero: " + zero + "\n one: " + one + "\n two: " + two + "\n three: " + three + "\n four: " + four + "\n five:" + five + "\n six: " + six + "\n seven: " + seven + "\n eight: " + eight + "\n nine: " + nine);
	}
}