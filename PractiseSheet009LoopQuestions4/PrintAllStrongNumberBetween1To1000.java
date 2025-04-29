/* Write a program to print all Strong numbers between 1 to 100. */
public class PrintAllStrongNumberBetween1To1000 {
	public static void main(String[] arg) {
		int end = 100;
		for(int num = 1; num <= end; ++num) {
			int sum = 0;
			int temp = num;
			while(temp > 0) {
				int digit = temp % 10;
				int factorial = 1;
				for(int i = digit; i > 0; --i) {
					factorial = factorial * i;
				}
				sum = sum + factorial;
				temp = temp / 10;
			}
			if(sum == num) {
				System.out.println(num);
			}
		}
	}
}