/* Write a program to find sum of all natural numbers between 1 to 100 using loop */
public class SumOfNaturalNumbersUpto100 {
	public static void main(String[] args) {
		int sum = 0;
		for(int num = 1; num <= 100; ++num) {
			sum += num;
		}
		System.out.println("Sum of natural number upto 100 is " + sum);
	}
}