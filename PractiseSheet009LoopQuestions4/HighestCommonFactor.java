// Write a program to find HCF(Highest Common Factor) of two numbers.
public class HighestCommonFactor {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 26;
		int small;
		if(num1 > num2) {
			small = num2;
		}
		else {
			small = num1;
		}
		int hcf = -1;
		for(int i = small; i > 0; --i) {
			if(num1 % i == 0) {
				if(num2 % i == 0) {
					if(hcf == -1) {
						hcf = i;
					}
				}
			}
		}
		System.out.println("HCF of " + num1 + " " + num2 + " is " + hcf);
	}
}