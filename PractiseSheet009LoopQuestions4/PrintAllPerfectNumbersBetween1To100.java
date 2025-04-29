/* WAP to print all Perfect numbers between 1 to 100 */
public class PrintAllPerfectNumbersBetween1To100 {
	public static void main(String[] args) {
		int end = 1000;
		for(int num = 1; num <= end; ++num) {
			if(num <= 0) {
				System.out.println("Enter a valid positive number");
			}
			else {
				int sumOfFactors = 0;
				for(int i = 1; i < num; ++i) {
					if(num % i == 0) {
						sumOfFactors = sumOfFactors + i;
					}
				}
				if(sumOfFactors == num) {
					System.out.println(num);
				}
			}
		}
	}
}