// Write a program to print all Perfect numbers between 1 to 1000. 
public class PrintPerfectNoUpto1000{
	public static void main(String[] args) {
		int num = 1;
		while(num <= 1000) {
			int sumOfFactor = 0;
			int fact = 1;
			while(fact <= num / 2) {
				if(num % fact == 0) {
					sumOfFactor += fact;
				}
				++fact;
			}
			if(sumOfFactor == num) {
				System.out.print(num + " ");
			}
			++num;
		}
		System.out.println();
	}
}